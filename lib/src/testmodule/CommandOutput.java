
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
 * <p>Original spec-file type: CommandOutput</p>
 * <pre>
 * A structure containing output and error strings.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "command_output",
    "command_error"
})
public class CommandOutput {

    @JsonProperty("command_output")
    private String commandOutput;
    @JsonProperty("command_error")
    private String commandError;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("command_output")
    public String getCommandOutput() {
        return commandOutput;
    }

    @JsonProperty("command_output")
    public void setCommandOutput(String commandOutput) {
        this.commandOutput = commandOutput;
    }

    public CommandOutput withCommandOutput(String commandOutput) {
        this.commandOutput = commandOutput;
        return this;
    }

    @JsonProperty("command_error")
    public String getCommandError() {
        return commandError;
    }

    @JsonProperty("command_error")
    public void setCommandError(String commandError) {
        this.commandError = commandError;
    }

    public CommandOutput withCommandError(String commandError) {
        this.commandError = commandError;
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
        return ((((((("CommandOutput"+" [commandOutput=")+ commandOutput)+", commandError=")+ commandError)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
