/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Bill */
public class Bill {
  StringUtil util = new StringUtil();

  @JsonProperty("Day")
  private Integer day;

  @JsonProperty("Type")
  private PaymentTermType type;

  public Bill day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Day of Month (0-31)
   *
   * @return day
   */
  @ApiModelProperty(value = "Day of Month (0-31)")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public Bill type(PaymentTermType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public PaymentTermType getType() {
    return type;
  }

  public void setType(PaymentTermType type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bill bill = (Bill) o;
    return Objects.equals(this.day, bill.day) && Objects.equals(this.type, bill.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bill {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
