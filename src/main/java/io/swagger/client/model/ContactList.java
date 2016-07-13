package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ContactList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-13T10:36:50.130Z")
public class ContactList   {
  
  private List<Object> items = new ArrayList<Object>();
  private Object lastEvaluatedKey = null;

  
  /**
   **/
  public ContactList items(List<Object> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Items")
  public List<Object> getItems() {
    return items;
  }
  public void setItems(List<Object> items) {
    this.items = items;
  }


  /**
   **/
  public ContactList lastEvaluatedKey(Object lastEvaluatedKey) {
    this.lastEvaluatedKey = lastEvaluatedKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("LastEvaluatedKey")
  public Object getLastEvaluatedKey() {
    return lastEvaluatedKey;
  }
  public void setLastEvaluatedKey(Object lastEvaluatedKey) {
    this.lastEvaluatedKey = lastEvaluatedKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactList contactList = (ContactList) o;
    return Objects.equals(this.items, contactList.items) &&
        Objects.equals(this.lastEvaluatedKey, contactList.lastEvaluatedKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, lastEvaluatedKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    lastEvaluatedKey: ").append(toIndentedString(lastEvaluatedKey)).append("\n");
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

