// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * The version of the OpenAPI document: 1.1.9
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.V1ParamSearch;

/**
 * V1Param
 */

public class V1Param {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private V1ParamSearch search;

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  private String connection;

  public static final String SERIALIZED_NAME_TO_INIT = "to_init";
  @SerializedName(SERIALIZED_NAME_TO_INIT)
  private Boolean toInit;

  public static final String SERIALIZED_NAME_CONTEXT_ONLY = "context_only";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ONLY)
  private Boolean contextOnly;


  public V1Param value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public V1Param ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }


  public V1Param search(V1ParamSearch search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ParamSearch getSearch() {
    return search;
  }


  public void setSearch(V1ParamSearch search) {
    this.search = search;
  }


  public V1Param connection(String connection) {
    
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnection() {
    return connection;
  }


  public void setConnection(String connection) {
    this.connection = connection;
  }


  public V1Param toInit(Boolean toInit) {
    
    this.toInit = toInit;
    return this;
  }

   /**
   * Get toInit
   * @return toInit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getToInit() {
    return toInit;
  }


  public void setToInit(Boolean toInit) {
    this.toInit = toInit;
  }


  public V1Param contextOnly(Boolean contextOnly) {
    
    this.contextOnly = contextOnly;
    return this;
  }

   /**
   * Get contextOnly
   * @return contextOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getContextOnly() {
    return contextOnly;
  }


  public void setContextOnly(Boolean contextOnly) {
    this.contextOnly = contextOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Param v1Param = (V1Param) o;
    return Objects.equals(this.value, v1Param.value) &&
        Objects.equals(this.ref, v1Param.ref) &&
        Objects.equals(this.search, v1Param.search) &&
        Objects.equals(this.connection, v1Param.connection) &&
        Objects.equals(this.toInit, v1Param.toInit) &&
        Objects.equals(this.contextOnly, v1Param.contextOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, ref, search, connection, toInit, contextOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Param {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    toInit: ").append(toIndentedString(toInit)).append("\n");
    sb.append("    contextOnly: ").append(toIndentedString(contextOnly)).append("\n");
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

