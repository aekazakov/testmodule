
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
 * <p>Original spec-file type: TomtomRunResult</p>
 * <pre>
 * Represents result of a single TOMTOM run
 * string id - KBase ID of TomtomRunResult
 * string timestamp - timestamp for creation time of TomtomRunResult
 * TomtomRunParameters params - run parameters
 * list<TomtomHit> hits - A list of all hits found by TOMTOM
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
public class TomtomRunResult {

    @JsonProperty("id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
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
    @JsonProperty("params")
    private TomtomRunParameters params;
    @JsonProperty("hits")
    private List<TomtomHit> hits;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TomtomRunResult withId(String id) {
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

    public TomtomRunResult withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

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
    @JsonProperty("params")
    public TomtomRunParameters getParams() {
        return params;
    }

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
    @JsonProperty("params")
    public void setParams(TomtomRunParameters params) {
        this.params = params;
    }

    public TomtomRunResult withParams(TomtomRunParameters params) {
        this.params = params;
        return this;
    }

    @JsonProperty("hits")
    public List<TomtomHit> getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(List<TomtomHit> hits) {
        this.hits = hits;
    }

    public TomtomRunResult withHits(List<TomtomHit> hits) {
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
        return ((((((((((("TomtomRunResult"+" [id=")+ id)+", timestamp=")+ timestamp)+", params=")+ params)+", hits=")+ hits)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
