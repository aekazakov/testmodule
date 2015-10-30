
package testmodule;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


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
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "mod",
    "nmotifs",
    "minw",
    "maxw",
    "nsites",
    "minsites",
    "maxsites",
    "pal",
    "revcomp",
    "source_ref",
    "source_id"
})
public class MemeRunParameters {

    @JsonProperty("mod")
    private String mod;
    @JsonProperty("nmotifs")
    private Long nmotifs;
    @JsonProperty("minw")
    private Long minw;
    @JsonProperty("maxw")
    private Long maxw;
    @JsonProperty("nsites")
    private Long nsites;
    @JsonProperty("minsites")
    private Long minsites;
    @JsonProperty("maxsites")
    private Long maxsites;
    @JsonProperty("pal")
    private Long pal;
    @JsonProperty("revcomp")
    private Long revcomp;
    @JsonProperty("source_ref")
    private String sourceRef;
    @JsonProperty("source_id")
    private String sourceId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mod")
    public String getMod() {
        return mod;
    }

    @JsonProperty("mod")
    public void setMod(String mod) {
        this.mod = mod;
    }

    public MemeRunParameters withMod(String mod) {
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

    public MemeRunParameters withNmotifs(Long nmotifs) {
        this.nmotifs = nmotifs;
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

    public MemeRunParameters withMinw(Long minw) {
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

    public MemeRunParameters withMaxw(Long maxw) {
        this.maxw = maxw;
        return this;
    }

    @JsonProperty("nsites")
    public Long getNsites() {
        return nsites;
    }

    @JsonProperty("nsites")
    public void setNsites(Long nsites) {
        this.nsites = nsites;
    }

    public MemeRunParameters withNsites(Long nsites) {
        this.nsites = nsites;
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

    public MemeRunParameters withMinsites(Long minsites) {
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

    public MemeRunParameters withMaxsites(Long maxsites) {
        this.maxsites = maxsites;
        return this;
    }

    @JsonProperty("pal")
    public Long getPal() {
        return pal;
    }

    @JsonProperty("pal")
    public void setPal(Long pal) {
        this.pal = pal;
    }

    public MemeRunParameters withPal(Long pal) {
        this.pal = pal;
        return this;
    }

    @JsonProperty("revcomp")
    public Long getRevcomp() {
        return revcomp;
    }

    @JsonProperty("revcomp")
    public void setRevcomp(Long revcomp) {
        this.revcomp = revcomp;
    }

    public MemeRunParameters withRevcomp(Long revcomp) {
        this.revcomp = revcomp;
        return this;
    }

    @JsonProperty("source_ref")
    public String getSourceRef() {
        return sourceRef;
    }

    @JsonProperty("source_ref")
    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public MemeRunParameters withSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
        return this;
    }

    @JsonProperty("source_id")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public MemeRunParameters withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((("MemeRunParameters"+" [mod=")+ mod)+", nmotifs=")+ nmotifs)+", minw=")+ minw)+", maxw=")+ maxw)+", nsites=")+ nsites)+", minsites=")+ minsites)+", maxsites=")+ maxsites)+", pal=")+ pal)+", revcomp=")+ revcomp)+", sourceRef=")+ sourceRef)+", sourceId=")+ sourceId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
