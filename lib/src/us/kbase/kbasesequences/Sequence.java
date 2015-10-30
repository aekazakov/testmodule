
package us.kbase.kbasesequences;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: Sequence</p>
 * <pre>
 * Represents a particular sequence from sequence set
 * string sequence_id - identifier of a sequence
 * string description - description of a sequence
 * string sequence - nucleotide sequence
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "sequence_id",
    "description",
    "sequence"
})
public class Sequence {

    @JsonProperty("sequence_id")
    private String sequenceId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("sequence")
    private String sequence;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sequence_id")
    public String getSequenceId() {
        return sequenceId;
    }

    @JsonProperty("sequence_id")
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Sequence withSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
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

    public Sequence withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("sequence")
    public String getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Sequence withSequence(String sequence) {
        this.sequence = sequence;
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
        return ((((((((("Sequence"+" [sequenceId=")+ sequenceId)+", description=")+ description)+", sequence=")+ sequence)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
