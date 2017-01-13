package com.getshoutout.shoutout.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


/**
 * Message
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class Message   {
  
  private String id = null;
  private String source = null;
  private List<String> destinations = new ArrayList<String>();

  /**
   * Gets or Sets transports
   */
  public enum TransportsEnum {
    SMS("sms");

    private String value;

    TransportsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<TransportsEnum> transports = new ArrayList<TransportsEnum>();
  private MessageContent content = null;

  
  /**
   **/
  public Message id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public Message source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public Message destinations(List<String> destinations) {
    this.destinations = destinations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("destinations")
  public List<String> getDestinations() {
    return destinations;
  }
  public void setDestinations(List<String> destinations) {
    this.destinations = destinations;
  }


  /**
   **/
  public Message transports(List<TransportsEnum> transports) {
    this.transports = transports;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transports")
  public List<TransportsEnum> getTransports() {
    return transports;
  }
  public void setTransports(List<TransportsEnum> transports) {
    this.transports = transports;
  }


  /**
   **/
  public Message content(MessageContent content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public MessageContent getContent() {
    return content;
  }
  public void setContent(MessageContent content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.id, message.id) &&
        Objects.equals(this.source, message.source) &&
        Objects.equals(this.destinations, message.destinations) &&
        Objects.equals(this.transports, message.transports) &&
        Objects.equals(this.content, message.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, destinations, transports, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    transports: ").append(toIndentedString(transports)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

