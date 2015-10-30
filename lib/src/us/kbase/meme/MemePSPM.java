
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
 * <p>Original spec-file type: MemePSPM</p>
 * <pre>
 * Represents a position-specific probability matrix fot MEME motif
 * string id - KBase ID of the matrix object
 * string source_id - KBase ID of source object
 * string description - description of motif
 * string alphabet - ALPHABET field of MEME output ("ACGT" for nucleotide motifs)
 * int width - width of motif
 * int nsites - number of sites
 * float evalue - E-value of motif
 * list<list<float>> matrix - The letter probability matrix is a table of probabilities where the rows are positions in the motif and the columns are letters in the alphabet. The columns are ordered alphabetically so for DNA the first column is A, the second is C, the third is G and the last is T.
 * @optional source_id description width nsites evalue
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "source_id",
    "description",
    "alphabet",
    "width",
    "nsites",
    "evalue",
    "matrix"
})
public class MemePSPM {

    @JsonProperty("id")
    private String id;
    @JsonProperty("source_id")
    private String sourceId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("alphabet")
    private String alphabet;
    @JsonProperty("width")
    private Long width;
    @JsonProperty("nsites")
    private Long nsites;
    @JsonProperty("evalue")
    private java.lang.Double evalue;
    @JsonProperty("matrix")
    private List<List<Double>> matrix;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MemePSPM withId(String id) {
        this.id = id;
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

    public MemePSPM withSourceId(String sourceId) {
        this.sourceId = sourceId;
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

    public MemePSPM withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("alphabet")
    public String getAlphabet() {
        return alphabet;
    }

    @JsonProperty("alphabet")
    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public MemePSPM withAlphabet(String alphabet) {
        this.alphabet = alphabet;
        return this;
    }

    @JsonProperty("width")
    public Long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    public MemePSPM withWidth(Long width) {
        this.width = width;
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

    public MemePSPM withNsites(Long nsites) {
        this.nsites = nsites;
        return this;
    }

    @JsonProperty("evalue")
    public java.lang.Double getEvalue() {
        return evalue;
    }

    @JsonProperty("evalue")
    public void setEvalue(java.lang.Double evalue) {
        this.evalue = evalue;
    }

    public MemePSPM withEvalue(java.lang.Double evalue) {
        this.evalue = evalue;
        return this;
    }

    @JsonProperty("matrix")
    public List<List<Double>> getMatrix() {
        return matrix;
    }

    @JsonProperty("matrix")
    public void setMatrix(List<List<Double>> matrix) {
        this.matrix = matrix;
    }

    public MemePSPM withMatrix(List<List<Double>> matrix) {
        this.matrix = matrix;
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
        return ((((((((((((((((((("MemePSPM"+" [id=")+ id)+", sourceId=")+ sourceId)+", description=")+ description)+", alphabet=")+ alphabet)+", width=")+ width)+", nsites=")+ nsites)+", evalue=")+ evalue)+", matrix=")+ matrix)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
