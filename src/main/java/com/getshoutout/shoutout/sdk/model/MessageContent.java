package com.getshoutout.shoutout.sdk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * MessageContent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class MessageContent   {
  
  private String sms = null;

  
  /**
   **/
  public MessageContent sms(String sms) {
    this.sms = sms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sms")
  public String getSms() {
    return sms;
  }
  public void setSms(String sms) {
    this.sms = sms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContent messageContent = (MessageContent) o;
    return Objects.equals(this.sms, messageContent.sms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContent {\n");
    
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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

