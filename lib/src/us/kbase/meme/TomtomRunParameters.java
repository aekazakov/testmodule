
package us.kbase.meme;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: TomtomRunParameters</p>
 * <pre>
 * Contains parameters of a TOMTOM run
 * meme_pspm_collection_ref query_ref - query motifs for TOMTOM run
 * meme_pspm_collection_ref target_ref - target motifs for TOMTOM run
 * string pspm_id - KBase ID of a MemePSPM from the query collection that will be used. When empty string provided, all motifs in the query collection will be used
 * float thresh - thresh parameter of TOMTOM run, must be smaller than or equal to 1.0 unless evalueTomtom == 1
 * int evalue - evalue parameter of TOMTOM run (accepable values are "0" and "1")
 * string dist - value of dist parameter of TOMTOM run (accepable values are "allr", "ed", "kullback", "pearson", "sandelin")
 * int internal - internal parameter of TOMTOM run (accepable values are "0" and "1")
 * int min_overlap - value of min-overlap parameter of TOMTOM run. In case a query motif is smaller than minOverlapTomtom specified, then the motif's width is used as the minimum overlap for that query.
 * @optional query_ref target_ref pspm_id thresh evalue dist internal min_overlap
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "query_ref",
    "target_ref",
    "pspm_id",
    "thresh",
    "evalue",
    "dist",
    "internal",
    "min_overlap"
})
public class TomtomRunParameters {

    @JsonProperty("query_ref")
    private String queryRef;
    @JsonProperty("target_ref")
    private String targetRef;
    @JsonProperty("pspm_id")
    private String pspmId;
    @JsonProperty("thresh")
    private Double thresh;
    @JsonProperty("evalue")
    private Long evalue;
    @JsonProperty("dist")
    private String dist;
    @JsonProperty("internal")
    private Long internal;
    @JsonProperty("min_overlap")
    private Long minOverlap;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("query_ref")
    public String getQueryRef() {
        return queryRef;
    }

    @JsonProperty("query_ref")
    public void setQueryRef(String queryRef) {
        this.queryRef = queryRef;
    }

    public TomtomRunParameters withQueryRef(String queryRef) {
        this.queryRef = queryRef;
        return this;
    }

    @JsonProperty("target_ref")
    public String getTargetRef() {
        return targetRef;
    }

    @JsonProperty("target_ref")
    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public TomtomRunParameters withTargetRef(String targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    @JsonProperty("pspm_id")
    public String getPspmId() {
        return pspmId;
    }

    @JsonProperty("pspm_id")
    public void setPspmId(String pspmId) {
        this.pspmId = pspmId;
    }

    public TomtomRunParameters withPspmId(String pspmId) {
        this.pspmId = pspmId;
        return this;
    }

    @JsonProperty("thresh")
    public Double getThresh() {
        return thresh;
    }

    @JsonProperty("thresh")
    public void setThresh(Double thresh) {
        this.thresh = thresh;
    }

    public TomtomRunParameters withThresh(Double thresh) {
        this.thresh = thresh;
        return this;
    }

    @JsonProperty("evalue")
    public Long getEvalue() {
        return evalue;
    }

    @JsonProperty("evalue")
    public void setEvalue(Long evalue) {
        this.evalue = evalue;
    }

    public TomtomRunParameters withEvalue(Long evalue) {
        this.evalue = evalue;
        return this;
    }

    @JsonProperty("dist")
    public String getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(String dist) {
        this.dist = dist;
    }

    public TomtomRunParameters withDist(String dist) {
        this.dist = dist;
        return this;
    }

    @JsonProperty("internal")
    public Long getInternal() {
        return internal;
    }

    @JsonProperty("internal")
    public void setInternal(Long internal) {
        this.internal = internal;
    }

    public TomtomRunParameters withInternal(Long internal) {
        this.internal = internal;
        return this;
    }

    @JsonProperty("min_overlap")
    public Long getMinOverlap() {
        return minOverlap;
    }

    @JsonProperty("min_overlap")
    public void setMinOverlap(Long minOverlap) {
        this.minOverlap = minOverlap;
    }

    public TomtomRunParameters withMinOverlap(Long minOverlap) {
        this.minOverlap = minOverlap;
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
        return ((((((((((((((((((("TomtomRunParameters"+" [queryRef=")+ queryRef)+", targetRef=")+ targetRef)+", pspmId=")+ pspmId)+", thresh=")+ thresh)+", evalue=")+ evalue)+", dist=")+ dist)+", internal=")+ internal)+", minOverlap=")+ minOverlap)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
