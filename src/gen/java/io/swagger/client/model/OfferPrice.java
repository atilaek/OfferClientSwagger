/*
 * Swagger Offers
 * This is a demo Offers  server developed by atilaek.   [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: atilaek@atilek.atilaek
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * OfferPrice
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-09-26T08:04:52.514Z[GMT]")public class OfferPrice {

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("currency")
  private String currency = null;
  public OfferPrice amount(Double amount) {
    this.amount = amount;
    return this;
  }



  /**
  * Get amount
  * @return amount
  **/
  @Schema(example = "6.66", description = "")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public OfferPrice currency(String currency) {
    this.currency = currency;
    return this;
  }



  /**
  * Get currency
  * @return currency
  **/
  @Schema(example = "NOK", description = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPrice offerPrice = (OfferPrice) o;
    return Objects.equals(this.amount, offerPrice.amount) &&
        Objects.equals(this.currency, offerPrice.currency);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPrice {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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