/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.15
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

/** ContactPerson */
public class ContactPerson {
  StringUtil util = new StringUtil();

  @JsonProperty("FirstName")
  private String firstName;

  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("EmailAddress")
  private String emailAddress;

  @JsonProperty("IncludeInEmails")
  private Boolean includeInEmails;

  public ContactPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of person
   *
   * @return firstName
   */
  @ApiModelProperty(value = "First name of person")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of person
   *
   * @return lastName
   */
  @ApiModelProperty(value = "Last name of person")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactPerson emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address of person
   *
   * @return emailAddress
   */
  @ApiModelProperty(value = "Email address of person")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public ContactPerson includeInEmails(Boolean includeInEmails) {
    this.includeInEmails = includeInEmails;
    return this;
  }

  /**
   * boolean to indicate whether contact should be included on emails with invoices etc.
   *
   * @return includeInEmails
   */
  @ApiModelProperty(
      value = "boolean to indicate whether contact should be included on emails with invoices etc.")
  public Boolean getIncludeInEmails() {
    return includeInEmails;
  }

  public void setIncludeInEmails(Boolean includeInEmails) {
    this.includeInEmails = includeInEmails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPerson contactPerson = (ContactPerson) o;
    return Objects.equals(this.firstName, contactPerson.firstName)
        && Objects.equals(this.lastName, contactPerson.lastName)
        && Objects.equals(this.emailAddress, contactPerson.emailAddress)
        && Objects.equals(this.includeInEmails, contactPerson.includeInEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, includeInEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPerson {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    includeInEmails: ").append(toIndentedString(includeInEmails)).append("\n");
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
