package com.getshoutout.shoutout.sdk.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;


/**
 * MessageResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class MessageResponse   {
  
  private String id = null;
  private Integer cost = null;
  private Integer balance = null;
  private String sentOn = null;
  private String status = null;

  
  /**
   **/
  public MessageResponse id(String id) {
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
  public MessageResponse cost(Integer cost) {
    this.cost = cost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cost")
  public Integer getCost() {
    return cost;
  }
  public void setCost(Integer cost) {
    this.cost = cost;
  }


  /**
   **/
  public MessageResponse balance(Integer balance) {
    this.balance = balance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("balance")
  public Integer getBalance() {
    return balance;
  }
  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  /**
   **/
  public MessageResponse sentOn(String sentOn) {
    this.sentOn = sentOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sent_on")
  public String getSentOn() {
    return sentOn;
  }
  public void setSentOn(String sentOn) {
    this.sentOn = sentOn;
  }


  /**
   **/
  public MessageResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.id, messageResponse.id) &&
        Objects.equals(this.cost, messageResponse.cost) &&
        Objects.equals(this.balance, messageResponse.balance) &&
        Objects.equals(this.sentOn, messageResponse.sentOn) &&
        Objects.equals(this.status, messageResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cost, balance, sentOn, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    sentOn: ").append(toIndentedString(sentOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

