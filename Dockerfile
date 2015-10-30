FROM kbase/depl:latest
MAINTAINER KBase Developer
# Install the SDK (should go away eventually)
RUN \
  . /kb/dev_container/user-env.sh && \
  cd /kb/dev_container/modules && \
  rm -rf jars && \
  git clone https://github.com/kbase/jars && \
  rm -rf kb_sdk && \
  git clone https://github.com/kbase/kb_sdk -b develop && \
  cd /kb/dev_container/modules/jars && \
  make deploy && \
  cd /kb/dev_container/modules/kb_sdk && \
  make


# -----------------------------------------

# Insert apt-get instructions here to install
# any required dependencies for your module.

# RUN apt-get update
RUN mkdir -p /tmp/meme/
WORKDIR /tmp/meme
ADD http://meme-suite.org/meme-software/4.8.1/meme_4.8.1.tar.gz ./meme_4.8.1.tar.gz
RUN tar xzfp meme_4.8.1.tar.gz 
WORKDIR /tmp/meme/meme_4.8.1
ADD http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_1 ./patch_4.8.1_1
ADD http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_2 ./patch_4.8.1_2
ADD http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_3 ./patch_4.8.1_3
ADD http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_4 ./patch_4.8.1_4
ADD http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_5 ./patch_4.8.1_5
RUN ./configure --prefix=/kb/runtime/meme --enable-build-libxml2 --enable-build-libxslt --with-mpicc=mpicc --with-mpidir=/usr
RUN make 
RUN patch -p0 -i patch_4.8.1_1 
RUN patch -p1 -i patch_4.8.1_2 
RUN patch -p2 -i patch_4.8.1_3
RUN patch -p3 -i patch_4.8.1_4
RUN patch -p4 -i patch_4.8.1_5
RUN make install
RUN ln -s /kb/runtime/meme/bin/meme /kb/runtime/bin/
RUN ln -s /kb/runtime/meme/bin/tomtom /kb/runtime/bin/
RUN ln -s /kb/runtime/meme/bin/mast /kb/runtime/bin/
RUN ln -s /kb/runtime/meme/bin/dust /kb/runtime/bin/
RUN rm -rf /tmp/meme
  
# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
ENV PATH=$PATH:/kb/dev_container/modules/kb_sdk/bin

WORKDIR /kb/module
# RUN perl ./build_meme.pl

RUN make

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
