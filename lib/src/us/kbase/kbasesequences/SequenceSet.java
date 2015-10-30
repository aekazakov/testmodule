
package us.kbase.kbasesequences;

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
 * <p>Original spec-file type: SequenceSet</p>
 * <pre>
 * Represents set of sequences
 * string sequence_set_id - identifier of sequence set
 * string description - description of a sequence set
 * list<Sequence> sequences - list of sequences
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "sequence_set_id",
    "description",
    "sequences"
})
public class SequenceSet {

    @JsonProperty("sequence_set_id")
    private String sequenceSetId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("sequences")
    private List<Sequence> sequences;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sequence_set_id")
    public String getSequenceSetId() {
        return sequenceSetId;
    }

    @JsonProperty("sequence_set_id")
    public void setSequenceSetId(String sequenceSetId) {
        this.sequenceSetId = sequenceSetId;
    }

    public SequenceSet withSequenceSetId(String sequenceSetId) {
        this.sequenceSetId = sequenceSetId;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public SequenceSet withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("sequences")
    public List<Sequence> getSequences() {
        return sequences;
    }

    @JsonProperty("sequences")
    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
    }

    public SequenceSet withSequences(List<Sequence> sequences) {
        this.sequences = sequences;
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
        return ((((((((("SequenceSet"+" [sequenceSetId=")+ sequenceSetId)+", description=")+ description)+", sequences=")+ sequences)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
