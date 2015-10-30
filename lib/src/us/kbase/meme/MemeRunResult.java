
package us.kbase.meme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import testmodule.MemeRunParameters;

/**
 * <p>Original spec-file type: MemeRunResult</p>
 * <pre>
 * Represents results of a single MEME run
 * string id - KBase ID of MemeRunResult
 * string source_ref - WS reference to source SequenceSet object
 * string source_id - id of source SequenceSet object
 * string timestamp - timestamp for creation time of collection
 * string version - version of MEME like "MEME version 4.9.0 (Release date: Wed Oct  3 11:07:26 EST 2012)"
 * string input_file_name - name of input file, DATAFILE field of MEME output
 * string alphabet - ALPHABET field of MEME output (like "ACGT")
 * string training_set - strings from TRAINING SET section, except DATAFILE and ALPHABET fields
 * string command_line - command line of MEME run 
 * string mod - value of mod parameter of MEME run
 * int nmotifs - value of nmotifs parameter of MEME run
 * string evt - value of evt parameter of MEME run
 * string object_function - value of object function parameter of MEME run
 * int minw - value of minw parameter of MEME run
 * int maxw - value of maxw parameter of MEME run
 * float minic - value of minic parameter of MEME run
 * int wg - value of wg parameter of MEME run
 * int ws - value of wc parameter of MEME run
 * string endgaps - value of endgaps parameter of MEME run
 * int minsites - value of minsites parameter of MEME run
 * int maxsites - value of maxsites parameter of MEME run
 * float wnsites - value of wnsites parameter of MEME run
 * int prob - value of prob parameter of MEME run
 * string spmap - value of spmsp parameter of MEME run
 * float spfuzz - value of spfuzz parameter of MEME run
 * string substring - value of substring parameter of MEME run
 * string branching - value of branching parameter of MEME run
 * string wbranch - value of wbranch parameter of MEME run
 * string prior - value of prior parameter of MEME run
 * float b - value of b parameter of MEME run
 * int maxiter - value of maxiter parameter of MEME run
 * float distance - value of distance parameter of MEME run
 * int n - value of n parameter of MEME run
 * int n_cap - value of N parameter of MEME run
 * string strands - value of strands parameter of MEME run
 * int seed - value of seed parameter of MEME run
 * int seqfrac - value of seqfrac parameter of MEME run
 * string letter_freq - letter frequencies in dataset
 * string bg_freq - background letter frequencies
 * list<MemeMotif> motifs - A list of all motifs in a collection
 * string raw_output - section of MEME output text file (all before motif data)
 * MemeRunParameters params
 * @optional source_ref source_id timestamp meme_version input_file_name alphabet training_set command_line mod nmotifs evt object_function minw maxw minic wg ws endgaps minsites maxsites wnsites prob spmap spfuzz substring branching wbranch prior b maxiter distance n n_cap strands seed seqfrac letter_freq bg_freq motifs raw_output
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "source_ref",
    "source_id",
    "timestamp",
    "meme_version",
    "input_file_name",
    "alphabet",
    "training_set",
    "command_line",
    "mod",
    "nmotifs",
    "evt",
    "object_function",
    "minw",
    "maxw",
    "minic",
    "wg",
    "ws",
    "endgaps",
    "minsites",
    "maxsites",
    "wnsites",
    "prob",
    "spmap",
    "spfuzz",
    "substring",
    "branching",
    "wbranch",
    "prior",
    "b",
    "maxiter",
    "distance",
    "n",
    "n_cap",
    "strands",
    "seed",
    "seqfrac",
    "letter_freq",
    "bg_freq",
    "motifs",
    "raw_output",
    "params"
})
public class MemeRunResult {

    @JsonProperty("id")
    private java.lang.String id;
    @JsonProperty("source_ref")
    private java.lang.String sourceRef;
    @JsonProperty("source_id")
    private java.lang.String sourceId;
    @JsonProperty("timestamp")
    private java.lang.String timestamp;
    @JsonProperty("meme_version")
    private java.lang.String memeVersion;
    @JsonProperty("input_file_name")
    private java.lang.String inputFileName;
    @JsonProperty("alphabet")
    private java.lang.String alphabet;
    @JsonProperty("training_set")
    private List<String> trainingSet;
    @JsonProperty("command_line")
    private java.lang.String commandLine;
    @JsonProperty("mod")
    private java.lang.String mod;
    @JsonProperty("nmotifs")
    private Long nmotifs;
    @JsonProperty("evt")
    private java.lang.String evt;
    @JsonProperty("object_function")
    private java.lang.String objectFunction;
    @JsonProperty("minw")
    private Long minw;
    @JsonProperty("maxw")
    private Long maxw;
    @JsonProperty("minic")
    private Double minic;
    @JsonProperty("wg")
    private Long wg;
    @JsonProperty("ws")
    private Long ws;
    @JsonProperty("endgaps")
    private java.lang.String endgaps;
    @JsonProperty("minsites")
    private Long minsites;
    @JsonProperty("maxsites")
    private Long maxsites;
    @JsonProperty("wnsites")
    private Double wnsites;
    @JsonProperty("prob")
    private Long prob;
    @JsonProperty("spmap")
    private java.lang.String spmap;
    @JsonProperty("spfuzz")
    private java.lang.String spfuzz;
    @JsonProperty("substring")
    private java.lang.String substring;
    @JsonProperty("branching")
    private java.lang.String branching;
    @JsonProperty("wbranch")
    private java.lang.String wbranch;
    @JsonProperty("prior")
    private java.lang.String prior;
    @JsonProperty("b")
    private Double b;
    @JsonProperty("maxiter")
    private Long maxiter;
    @JsonProperty("distance")
    private Double distance;
    @JsonProperty("n")
    private Long n;
    @JsonProperty("n_cap")
    private Long nCap;
    @JsonProperty("strands")
    private java.lang.String strands;
    @JsonProperty("seed")
    private Long seed;
    @JsonProperty("seqfrac")
    private Long seqfrac;
    @JsonProperty("letter_freq")
    private java.lang.String letterFreq;
    @JsonProperty("bg_freq")
    private java.lang.String bgFreq;
    @JsonProperty("motifs")
    private List<MemeMotif> motifs;
    @JsonProperty("raw_output")
    private java.lang.String rawOutput;
    /**
     * <p>Original spec-file type: MemeRunParameters</p>
     * <pre>
     * Contains parameters of a MEME run
     * string mod - distribution of motifs, acceptable values are "oops", "zoops", "anr"
     * int nmotifs - maximum number of motifs to find
     * int minw - minumum motif width
     * int maxw - maximum motif width
     * int nsites - number of sites for each motif
     * int minsites - minimum number of sites for each motif
     * int maxsites - maximum number of sites for each motif
     * int pal - force palindromes, acceptable values are 0 and 1
     * int revcomp - allow sites on + or - DNA strands, acceptable values are 0 and 1
     * sequence_set_ref source_ref - WS reference to source SequenceSet object
     * string source_id - id of source SequenceSet object
     * @optional nmotifs minw maxw nsites minsites maxsites pal revcomp source_ref source_id
     * </pre>
     * 
     */
    @JsonProperty("params")
    private MemeRunParameters params;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public MemeRunResult withId(java.lang.String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("source_ref")
    public java.lang.String getSourceRef() {
        return sourceRef;
    }

    @JsonProperty("source_ref")
    public void setSourceRef(java.lang.String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public MemeRunResult withSourceRef(java.lang.String sourceRef) {
        this.sourceRef = sourceRef;
        return this;
    }

    @JsonProperty("source_id")
    public java.lang.String getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }

    public MemeRunResult withSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    @JsonProperty("timestamp")
    public java.lang.String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }

    public MemeRunResult withTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("meme_version")
    public java.lang.String getMemeVersion() {
        return memeVersion;
    }

    @JsonProperty("meme_version")
    public void setMemeVersion(java.lang.String memeVersion) {
        this.memeVersion = memeVersion;
    }

    public MemeRunResult withMemeVersion(java.lang.String memeVersion) {
        this.memeVersion = memeVersion;
        return this;
    }

    @JsonProperty("input_file_name")
    public java.lang.String getInputFileName() {
        return inputFileName;
    }

    @JsonProperty("input_file_name")
    public void setInputFileName(java.lang.String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public MemeRunResult withInputFileName(java.lang.String inputFileName) {
        this.inputFileName = inputFileName;
        return this;
    }

    @JsonProperty("alphabet")
    public java.lang.String getAlphabet() {
        return alphabet;
    }

    @JsonProperty("alphabet")
    public void setAlphabet(java.lang.String alphabet) {
        this.alphabet = alphabet;
    }

    public MemeRunResult withAlphabet(java.lang.String alphabet) {
        this.alphabet = alphabet;
        return this;
    }

    @JsonProperty("training_set")
    public List<String> getTrainingSet() {
        return trainingSet;
    }

    @JsonProperty("training_set")
    public void setTrainingSet(List<String> trainingSet) {
        this.trainingSet = trainingSet;
    }

    public MemeRunResult withTrainingSet(List<String> trainingSet) {
        this.trainingSet = trainingSet;
        return this;
    }

    @JsonProperty("command_line")
    public java.lang.String getCommandLine() {
        return commandLine;
    }

    @JsonProperty("command_line")
    public void setCommandLine(java.lang.String commandLine) {
        this.commandLine = commandLine;
    }

    public MemeRunResult withCommandLine(java.lang.String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    @JsonProperty("mod")
    public java.lang.String getMod() {
        return mod;
    }

    @JsonProperty("mod")
    public void setMod(java.lang.String mod) {
        this.mod = mod;
    }

    public MemeRunResult withMod(java.lang.String mod) {
        this.mod = mod;
        return this;
    }

    @JsonProperty("nmotifs")
    public Long getNmotifs() {
        return nmotifs;
    }

    @JsonProperty("nmotifs")
    public void setNmotifs(Long nmotifs) {
        this.nmotifs = nmotifs;
    }

    public MemeRunResult withNmotifs(Long nmotifs) {
        this.nmotifs = nmotifs;
        return this;
    }

    @JsonProperty("evt")
    public java.lang.String getEvt() {
        return evt;
    }

    @JsonProperty("evt")
    public void setEvt(java.lang.String evt) {
        this.evt = evt;
    }

    public MemeRunResult withEvt(java.lang.String evt) {
        this.evt = evt;
        return this;
    }

    @JsonProperty("object_function")
    public java.lang.String getObjectFunction() {
        return objectFunction;
    }

    @JsonProperty("object_function")
    public void setObjectFunction(java.lang.String objectFunction) {
        this.objectFunction = objectFunction;
    }

    public MemeRunResult withObjectFunction(java.lang.String objectFunction) {
        this.objectFunction = objectFunction;
        return this;
    }

    @JsonProperty("minw")
    public Long getMinw() {
        return minw;
    }

    @JsonProperty("minw")
    public void setMinw(Long minw) {
        this.minw = minw;
    }

    public MemeRunResult withMinw(Long minw) {
        this.minw = minw;
        return this;
    }

    @JsonProperty("maxw")
    public Long getMaxw() {
        return maxw;
    }

    @JsonProperty("maxw")
    public void setMaxw(Long maxw) {
        this.maxw = maxw;
    }

    public MemeRunResult withMaxw(Long maxw) {
        this.maxw = maxw;
        return this;
    }

    @JsonProperty("minic")
    public Double getMinic() {
        return minic;
    }

    @JsonProperty("minic")
    public void setMinic(Double minic) {
        this.minic = minic;
    }

    public MemeRunResult withMinic(Double minic) {
        this.minic = minic;
        return this;
    }

    @JsonProperty("wg")
    public Long getWg() {
        return wg;
    }

    @JsonProperty("wg")
    public void setWg(Long wg) {
        this.wg = wg;
    }

    public MemeRunResult withWg(Long wg) {
        this.wg = wg;
        return this;
    }

    @JsonProperty("ws")
    public Long getWs() {
        return ws;
    }

    @JsonProperty("ws")
    public void setWs(Long ws) {
        this.ws = ws;
    }

    public MemeRunResult withWs(Long ws) {
        this.ws = ws;
        return this;
    }

    @JsonProperty("endgaps")
    public java.lang.String getEndgaps() {
        return endgaps;
    }

    @JsonProperty("endgaps")
    public void setEndgaps(java.lang.String endgaps) {
        this.endgaps = endgaps;
    }

    public MemeRunResult withEndgaps(java.lang.String endgaps) {
        this.endgaps = endgaps;
        return this;
    }

    @JsonProperty("minsites")
    public Long getMinsites() {
        return minsites;
    }

    @JsonProperty("minsites")
    public void setMinsites(Long minsites) {
        this.minsites = minsites;
    }

    public MemeRunResult withMinsites(Long minsites) {
        this.minsites = minsites;
        return this;
    }

    @JsonProperty("maxsites")
    public Long getMaxsites() {
        return maxsites;
    }

    @JsonProperty("maxsites")
    public void setMaxsites(Long maxsites) {
        this.maxsites = maxsites;
    }

    public MemeRunResult withMaxsites(Long maxsites) {
        this.maxsites = maxsites;
        return this;
    }

    @JsonProperty("wnsites")
    public Double getWnsites() {
        return wnsites;
    }

    @JsonProperty("wnsites")
    public void setWnsites(Double wnsites) {
        this.wnsites = wnsites;
    }

    public MemeRunResult withWnsites(Double wnsites) {
        this.wnsites = wnsites;
        return this;
    }

    @JsonProperty("prob")
    public Long getProb() {
        return prob;
    }

    @JsonProperty("prob")
    public void setProb(Long prob) {
        this.prob = prob;
    }

    public MemeRunResult withProb(Long prob) {
        this.prob = prob;
        return this;
    }

    @JsonProperty("spmap")
    public java.lang.String getSpmap() {
        return spmap;
    }

    @JsonProperty("spmap")
    public void setSpmap(java.lang.String spmap) {
        this.spmap = spmap;
    }

    public MemeRunResult withSpmap(java.lang.String spmap) {
        this.spmap = spmap;
        return this;
    }

    @JsonProperty("spfuzz")
    public java.lang.String getSpfuzz() {
        return spfuzz;
    }

    @JsonProperty("spfuzz")
    public void setSpfuzz(java.lang.String spfuzz) {
        this.spfuzz = spfuzz;
    }

    public MemeRunResult withSpfuzz(java.lang.String spfuzz) {
        this.spfuzz = spfuzz;
        return this;
    }

    @JsonProperty("substring")
    public java.lang.String getSubstring() {
        return substring;
    }

    @JsonProperty("substring")
    public void setSubstring(java.lang.String substring) {
        this.substring = substring;
    }

    public MemeRunResult withSubstring(java.lang.String substring) {
        this.substring = substring;
        return this;
    }

    @JsonProperty("branching")
    public java.lang.String getBranching() {
        return branching;
    }

    @JsonProperty("branching")
    public void setBranching(java.lang.String branching) {
        this.branching = branching;
    }

    public MemeRunResult withBranching(java.lang.String branching) {
        this.branching = branching;
        return this;
    }

    @JsonProperty("wbranch")
    public java.lang.String getWbranch() {
        return wbranch;
    }

    @JsonProperty("wbranch")
    public void setWbranch(java.lang.String wbranch) {
        this.wbranch = wbranch;
    }

    public MemeRunResult withWbranch(java.lang.String wbranch) {
        this.wbranch = wbranch;
        return this;
    }

    @JsonProperty("prior")
    public java.lang.String getPrior() {
        return prior;
    }

    @JsonProperty("prior")
    public void setPrior(java.lang.String prior) {
        this.prior = prior;
    }

    public MemeRunResult withPrior(java.lang.String prior) {
        this.prior = prior;
        return this;
    }

    @JsonProperty("b")
    public Double getB() {
        return b;
    }

    @JsonProperty("b")
    public void setB(Double b) {
        this.b = b;
    }

    public MemeRunResult withB(Double b) {
        this.b = b;
        return this;
    }

    @JsonProperty("maxiter")
    public Long getMaxiter() {
        return maxiter;
    }

    @JsonProperty("maxiter")
    public void setMaxiter(Long maxiter) {
        this.maxiter = maxiter;
    }

    public MemeRunResult withMaxiter(Long maxiter) {
        this.maxiter = maxiter;
        return this;
    }

    @JsonProperty("distance")
    public Double getDistance() {
        return distance;
    }

    @JsonProperty("distance")
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public MemeRunResult withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    @JsonProperty("n")
    public Long getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(Long n) {
        this.n = n;
    }

    public MemeRunResult withN(Long n) {
        this.n = n;
        return this;
    }

    @JsonProperty("n_cap")
    public Long getNCap() {
        return nCap;
    }

    @JsonProperty("n_cap")
    public void setNCap(Long nCap) {
        this.nCap = nCap;
    }

    public MemeRunResult withNCap(Long nCap) {
        this.nCap = nCap;
        return this;
    }

    @JsonProperty("strands")
    public java.lang.String getStrands() {
        return strands;
    }

    @JsonProperty("strands")
    public void setStrands(java.lang.String strands) {
        this.strands = strands;
    }

    public MemeRunResult withStrands(java.lang.String strands) {
        this.strands = strands;
        return this;
    }

    @JsonProperty("seed")
    public Long getSeed() {
        return seed;
    }

    @JsonProperty("seed")
    public void setSeed(Long seed) {
        this.seed = seed;
    }

    public MemeRunResult withSeed(Long seed) {
        this.seed = seed;
        return this;
    }

    @JsonProperty("seqfrac")
    public Long getSeqfrac() {
        return seqfrac;
    }

    @JsonProperty("seqfrac")
    public void setSeqfrac(Long seqfrac) {
        this.seqfrac = seqfrac;
    }

    public MemeRunResult withSeqfrac(Long seqfrac) {
        this.seqfrac = seqfrac;
        return this;
    }

    @JsonProperty("letter_freq")
    public java.lang.String getLetterFreq() {
        return letterFreq;
    }

    @JsonProperty("letter_freq")
    public void setLetterFreq(java.lang.String letterFreq) {
        this.letterFreq = letterFreq;
    }

    public MemeRunResult withLetterFreq(java.lang.String letterFreq) {
        this.letterFreq = letterFreq;
        return this;
    }

    @JsonProperty("bg_freq")
    public java.lang.String getBgFreq() {
        return bgFreq;
    }

    @JsonProperty("bg_freq")
    public void setBgFreq(java.lang.String bgFreq) {
        this.bgFreq = bgFreq;
    }

    public MemeRunResult withBgFreq(java.lang.String bgFreq) {
        this.bgFreq = bgFreq;
        return this;
    }

    @JsonProperty("motifs")
    public List<MemeMotif> getMotifs() {
        return motifs;
    }

    @JsonProperty("motifs")
    public void setMotifs(List<MemeMotif> motifs) {
        this.motifs = motifs;
    }

    public MemeRunResult withMotifs(List<MemeMotif> motifs) {
        this.motifs = motifs;
        return this;
    }

    @JsonProperty("raw_output")
    public java.lang.String getRawOutput() {
        return rawOutput;
    }

    @JsonProperty("raw_output")
    public void setRawOutput(java.lang.String rawOutput) {
        this.rawOutput = rawOutput;
    }

    public MemeRunResult withRawOutput(java.lang.String rawOutput) {
        this.rawOutput = rawOutput;
        return this;
    }

    /**
     * <p>Original spec-file type: MemeRunParameters</p>
     * <pre>
     * Contains parameters of a MEME run
     * string mod - distribution of motifs, acceptable values are "oops", "zoops", "anr"
     * int nmotifs - maximum number of motifs to find
     * int minw - minumum motif width
     * int maxw - maximum motif width
     * int nsites - number of sites for each motif
     * int minsites - minimum number of sites for each motif
     * int maxsites - maximum number of sites for each motif
     * int pal - force palindromes, acceptable values are 0 and 1
     * int revcomp - allow sites on + or - DNA strands, acceptable values are 0 and 1
     * sequence_set_ref source_ref - WS reference to source SequenceSet object
     * string source_id - id of source SequenceSet object
     * @optional nmotifs minw maxw nsites minsites maxsites pal revcomp source_ref source_id
     * </pre>
     * 
     */
    @JsonProperty("params")
    public MemeRunParameters getParams() {
        return params;
    }

    /**
     * <p>Original spec-file type: MemeRunParameters</p>
     * <pre>
     * Contains parameters of a MEME run
     * string mod - distribution of motifs, acceptable values are "oops", "zoops", "anr"
     * int nmotifs - maximum number of motifs to find
     * int minw - minumum motif width
     * int maxw - maximum motif width
     * int nsites - number of sites for each motif
     * int minsites - minimum number of sites for each motif
     * int maxsites - maximum number of sites for each motif
     * int pal - force palindromes, acceptable values are 0 and 1
     * int revcomp - allow sites on + or - DNA strands, acceptable values are 0 and 1
     * sequence_set_ref source_ref - WS reference to source SequenceSet object
     * string source_id - id of source SequenceSet object
     * @optional nmotifs minw maxw nsites minsites maxsites pal revcomp source_ref source_id
     * </pre>
     * 
     */
    @JsonProperty("params")
    public void setParams(MemeRunParameters params) {
        this.params = params;
    }

    public MemeRunResult withParams(MemeRunParameters params) {
        this.params = params;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("MemeRunResult"+" [id=")+ id)+", sourceRef=")+ sourceRef)+", sourceId=")+ sourceId)+", timestamp=")+ timestamp)+", memeVersion=")+ memeVersion)+", inputFileName=")+ inputFileName)+", alphabet=")+ alphabet)+", trainingSet=")+ trainingSet)+", commandLine=")+ commandLine)+", mod=")+ mod)+", nmotifs=")+ nmotifs)+", evt=")+ evt)+", objectFunction=")+ objectFunction)+", minw=")+ minw)+", maxw=")+ maxw)+", minic=")+ minic)+", wg=")+ wg)+", ws=")+ ws)+", endgaps=")+ endgaps)+", minsites=")+ minsites)+", maxsites=")+ maxsites)+", wnsites=")+ wnsites)+", prob=")+ prob)+", spmap=")+ spmap)+", spfuzz=")+ spfuzz)+", substring=")+ substring)+", branching=")+ branching)+", wbranch=")+ wbranch)+", prior=")+ prior)+", b=")+ b)+", maxiter=")+ maxiter)+", distance=")+ distance)+", n=")+ n)+", nCap=")+ nCap)+", strands=")+ strands)+", seed=")+ seed)+", seqfrac=")+ seqfrac)+", letterFreq=")+ letterFreq)+", bgFreq=")+ bgFreq)+", motifs=")+ motifs)+", rawOutput=")+ rawOutput)+", params=")+ params)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
