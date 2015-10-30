
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
 * <p>Original spec-file type: MemeMotif</p>
 * <pre>
 * Represents a particular motif found by MEME
 * string id - KBase ID of MemeMotif
 * string description - name of motif or number of motif in collection or anything else
 * int width - width of motif
 * int sites - number of sites
 * float llr - log likelihood ratio of motif
 * float evalue - E-value of motif
 * string raw_output - part of MEME output file with data about this motif
 * list<MemeSite> sites - list of sites
 * @optional description width llr evalue raw_output
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "description",
    "width",
    "llr",
    "evalue",
    "raw_output",
    "sites"
})
public class MemeMotif {

    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("width")
    private Long width;
    @JsonProperty("llr")
    private Double llr;
    @JsonProperty("evalue")
    private Double evalue;
    @JsonProperty("raw_output")
    private String rawOutput;
    @JsonProperty("sites")
    private List<MemeSite> sites;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MemeMotif withId(String id) {
        this.id = id;
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

    public MemeMotif withDescription(String description) {
        this.description = description;
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

    public MemeMotif withWidth(Long width) {
        this.width = width;
        return this;
    }

    @JsonProperty("llr")
    public Double getLlr() {
        return llr;
    }

    @JsonProperty("llr")
    public void setLlr(Double llr) {
        this.llr = llr;
    }

    public MemeMotif withLlr(Double llr) {
        this.llr = llr;
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

    public MemeMotif withEvalue(Double evalue) {
        this.evalue = evalue;
        return this;
    }

    @JsonProperty("raw_output")
    public String getRawOutput() {
        return rawOutput;
    }

    @JsonProperty("raw_output")
    public void setRawOutput(String rawOutput) {
        this.rawOutput = rawOutput;
    }

    public MemeMotif withRawOutput(String rawOutput) {
        this.rawOutput = rawOutput;
        return this;
    }

    @JsonProperty("sites")
    public List<MemeSite> getSites() {
        return sites;
    }

    @JsonProperty("sites")
    public void setSites(List<MemeSite> sites) {
        this.sites = sites;
    }

    public MemeMotif withSites(List<MemeSite> sites) {
        this.sites = sites;
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
        return ((((((((((((((((("MemeMotif"+" [id=")+ id)+", description=")+ description)+", width=")+ width)+", llr=")+ llr)+", evalue=")+ evalue)+", rawOutput=")+ rawOutput)+", sites=")+ sites)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
