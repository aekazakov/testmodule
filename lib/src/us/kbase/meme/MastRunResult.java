
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


/**
 * <p>Original spec-file type: MastRunResult</p>
 * <pre>
 * Represents result of a single MAST run
 * string id - KBase ID of MastRunResult
 * string timestamp - timestamp for creation time of MastRunResult
 * MastRunParameters params - run parameters
 * list<MastHit> hits - A list of all hits found by MAST
 * @optional timestamp hits
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "timestamp",
    "params",
    "hits"
})
public class MastRunResult {

    @JsonProperty("id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
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
    @JsonProperty("params")
    private MastRunParameters params;
    @JsonProperty("hits")
    private List<MastHit> hits;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MastRunResult withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public MastRunResult withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

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
    @JsonProperty("params")
    public MastRunParameters getParams() {
        return params;
    }

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
    @JsonProperty("params")
    public void setParams(MastRunParameters params) {
        this.params = params;
    }

    public MastRunResult withParams(MastRunParameters params) {
        this.params = params;
        return this;
    }

    @JsonProperty("hits")
    public List<MastHit> getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(List<MastHit> hits) {
        this.hits = hits;
    }

    public MastRunResult withHits(List<MastHit> hits) {
        this.hits = hits;
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
        return ((((((((((("MastRunResult"+" [id=")+ id)+", timestamp=")+ timestamp)+", params=")+ params)+", hits=")+ hits)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
