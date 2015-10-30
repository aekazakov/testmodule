
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
 * <p>Original spec-file type: TomtomHit</p>
 * <pre>
 * Represents a particluar TOMTOM hit
 * string query_pspm_id - id of query MemePSPM
 * string target_pspm_id - id of target MemePSPM
 * int optimal_offset - Optimal offset: the offset between the query and the target motif
 * float pvalue - p-value
 * float evalue - E-value
 * float qvalue - q-value
 * int overlap - Overlap: the number of positions of overlap between the two motifs.
 * string query_consensus - Query consensus sequence.
 * string target_consensus - Target consensus sequence.
 * string strand - Orientation: Orientation of target motif with respect to query motif.
 * @optional optimal_offset pvalue evalue qvalue overlap query_consensus target_consensus strand
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "query_pspm_id",
    "target_pspm_id",
    "optimal_offset",
    "pvalue",
    "evalue",
    "qvalue",
    "overlap",
    "query_consensus",
    "target_consensus",
    "strand"
})
public class TomtomHit {

    @JsonProperty("query_pspm_id")
    private String queryPspmId;
    @JsonProperty("target_pspm_id")
    private String targetPspmId;
    @JsonProperty("optimal_offset")
    private Long optimalOffset;
    @JsonProperty("pvalue")
    private Double pvalue;
    @JsonProperty("evalue")
    private Double evalue;
    @JsonProperty("qvalue")
    private Double qvalue;
    @JsonProperty("overlap")
    private Long overlap;
    @JsonProperty("query_consensus")
    private String queryConsensus;
    @JsonProperty("target_consensus")
    private String targetConsensus;
    @JsonProperty("strand")
    private String strand;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("query_pspm_id")
    public String getQueryPspmId() {
        return queryPspmId;
    }

    @JsonProperty("query_pspm_id")
    public void setQueryPspmId(String queryPspmId) {
        this.queryPspmId = queryPspmId;
    }

    public TomtomHit withQueryPspmId(String queryPspmId) {
        this.queryPspmId = queryPspmId;
        return this;
    }

    @JsonProperty("target_pspm_id")
    public String getTargetPspmId() {
        return targetPspmId;
    }

    @JsonProperty("target_pspm_id")
    public void setTargetPspmId(String targetPspmId) {
        this.targetPspmId = targetPspmId;
    }

    public TomtomHit withTargetPspmId(String targetPspmId) {
        this.targetPspmId = targetPspmId;
        return this;
    }

    @JsonProperty("optimal_offset")
    public Long getOptimalOffset() {
        return optimalOffset;
    }

    @JsonProperty("optimal_offset")
    public void setOptimalOffset(Long optimalOffset) {
        this.optimalOffset = optimalOffset;
    }

    public TomtomHit withOptimalOffset(Long optimalOffset) {
        this.optimalOffset = optimalOffset;
        return this;
    }

    @JsonProperty("pvalue")
    public Double getPvalue() {
        return pvalue;
    }

    @JsonProperty("pvalue")
    public void setPvalue(Double pvalue) {
        this.pvalue = pvalue;
    }

    public TomtomHit withPvalue(Double pvalue) {
        this.pvalue = pvalue;
        return this;
    }

    @JsonProperty("evalue")
    public Double getEvalue() {
        return evalue;
    }

    @JsonProperty("evalue")
    public void setEvalue(Double evalue) {
        this.evalue = evalue;
    }

    public TomtomHit withEvalue(Double evalue) {
        this.evalue = evalue;
        return this;
    }

    @JsonProperty("qvalue")
    public Double getQvalue() {
        return qvalue;
    }

    @JsonProperty("qvalue")
    public void setQvalue(Double qvalue) {
        this.qvalue = qvalue;
    }

    public TomtomHit withQvalue(Double qvalue) {
        this.qvalue = qvalue;
        return this;
    }

    @JsonProperty("overlap")
    public Long getOverlap() {
        return overlap;
    }

    @JsonProperty("overlap")
    public void setOverlap(Long overlap) {
        this.overlap = overlap;
    }

    public TomtomHit withOverlap(Long overlap) {
        this.overlap = overlap;
        return this;
    }

    @JsonProperty("query_consensus")
    public String getQueryConsensus() {
        return queryConsensus;
    }

    @JsonProperty("query_consensus")
    public void setQueryConsensus(String queryConsensus) {
        this.queryConsensus = queryConsensus;
    }

    public TomtomHit withQueryConsensus(String queryConsensus) {
        this.queryConsensus = queryConsensus;
        return this;
    }

    @JsonProperty("target_consensus")
    public String getTargetConsensus() {
        return targetConsensus;
    }

    @JsonProperty("target_consensus")
    public void setTargetConsensus(String targetConsensus) {
        this.targetConsensus = targetConsensus;
    }

    public TomtomHit withTargetConsensus(String targetConsensus) {
        this.targetConsensus = targetConsensus;
        return this;
    }

    @JsonProperty("strand")
    public String getStrand() {
        return strand;
    }

    @JsonProperty("strand")
    public void setStrand(String strand) {
        this.strand = strand;
    }

    public TomtomHit withStrand(String strand) {
        this.strand = strand;
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
        return ((((((((((((((((((((((("TomtomHit"+" [queryPspmId=")+ queryPspmId)+", targetPspmId=")+ targetPspmId)+", optimalOffset=")+ optimalOffset)+", pvalue=")+ pvalue)+", evalue=")+ evalue)+", qvalue=")+ qvalue)+", overlap=")+ overlap)+", queryConsensus=")+ queryConsensus)+", targetConsensus=")+ targetConsensus)+", strand=")+ strand)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
