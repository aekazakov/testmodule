
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
 * <p>Original spec-file type: MastRunParameters</p>
 * <pre>
 * Contains parameters of a MAST run
 * meme_pspm_collection_ref query_ref - query motifs for MAST run
 * sequence_set_ref target_ref - target sequences for MAST run
 * string pspm_id - KBase ID of a MemePSPM from the query collection that will be used. When empty string provided, all motifs in the query collection will be used
 * float mt - value of mt parameter for MAST run
 * @optional query_ref target_ref pspm_id mt
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "query_ref",
    "target_ref",
    "pspm_id",
    "mt"
})
public class MastRunParameters {

    @JsonProperty("query_ref")
    private String queryRef;
    @JsonProperty("target_ref")
    private String targetRef;
    @JsonProperty("pspm_id")
    private String pspmId;
    @JsonProperty("mt")
    private Double mt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("query_ref")
    public String getQueryRef() {
        return queryRef;
    }

    @JsonProperty("query_ref")
    public void setQueryRef(String queryRef) {
        this.queryRef = queryRef;
    }

    public MastRunParameters withQueryRef(String queryRef) {
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

    public MastRunParameters withTargetRef(String targetRef) {
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

    public MastRunParameters withPspmId(String pspmId) {
        this.pspmId = pspmId;
        return this;
    }

    @JsonProperty("mt")
    public Double getMt() {
        return mt;
    }

    @JsonProperty("mt")
    public void setMt(Double mt) {
        this.mt = mt;
    }

    public MastRunParameters withMt(Double mt) {
        this.mt = mt;
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
        return ((((((((((("MastRunParameters"+" [queryRef=")+ queryRef)+", targetRef=")+ targetRef)+", pspmId=")+ pspmId)+", mt=")+ mt)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
