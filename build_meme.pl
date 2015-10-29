#!/usr/bin/env perl

use strict;

use Carp;
use File::Basename;
use Cwd 'abs_path';

my $dest = "/kb/runtime";
my $parallel = 4;

-d $dest || mkdir $dest;

my $vers = "4.8.1";
my $meme_dir = "meme_$vers";
my $meme_tar = "meme_$vers.tar.gz";
my $meme_url = "http://meme-suite.org/meme-software/4.8.1/meme_4.8.1.tar.gz";
my $meme_patch1_url = "http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_1";
my $meme_patch2_url = "http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_2";
my $meme_patch3_url = "http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_3";
my $meme_patch4_url = "http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_4";
my $meme_patch5_url = "http://meme-suite.org/meme-software/4.8.1/patch_4.8.1_5";
my $meme_patch1 = "patch_4.8.1_1";
my $meme_patch2 = "patch_4.8.1_2";
my $meme_patch3 = "patch_4.8.1_3";
my $meme_patch4 = "patch_4.8.1_4";
my $meme_patch5 = "patch_4.8.1_5";

if (! -s $meme_tar) {
    system("curl", "-o", $meme_tar, "-L", $meme_url);
};

system("rm", "-rf", $meme_dir);
system("tar", "xzfp", $meme_tar);
chdir($meme_dir);
system("./configure", "--prefix=$dest/meme", "--enable-build-libxml2", "--enable-build-libxslt", "--with-mpicc=mpicc", "--with-mpidir=/usr");
system("make");
system("curl", "-o", $meme_patch1, "-L", $meme_patch1_url);
system("patch", "-p0", "-i", $meme_patch1);
system("curl", "-o", $meme_patch2, "-L", $meme_patch2_url);
system("patch", "-p1", "-i", $meme_patch2);
system("curl", "-o", $meme_patch3, "-L", $meme_patch3_url);
system("patch", "-p1", "-i", $meme_patch3);
system("curl", "-o", $meme_patch4, "-L", $meme_patch4_url);
system("patch", "-p0", "-i", $meme_patch4);
system("curl", "-o", $meme_patch5, "-L", $meme_patch5_url);
system("patch", "-p1", "-i", $meme_patch5);
system("make", "install");

