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
 * OpenAPI spec version: 1.0.75
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V1Bayes;
import io.swagger.client.model.V1GridSearch;
import io.swagger.client.model.V1Hyperband;
import io.swagger.client.model.V1Hyperopt;
import io.swagger.client.model.V1Iterative;
import io.swagger.client.model.V1Mapping;
import io.swagger.client.model.V1RandomSearch;
import java.io.IOException;

/**
 * V1Parallel
 */

public class V1Parallel {
  @SerializedName("random")
  private V1RandomSearch random = null;

  @SerializedName("grid")
  private V1GridSearch grid = null;

  @SerializedName("hyperband")
  private V1Hyperband hyperband = null;

  @SerializedName("bayes")
  private V1Bayes bayes = null;

  @SerializedName("hyperopt")
  private V1Hyperopt hyperopt = null;

  @SerializedName("iterative")
  private V1Iterative iterative = null;

  @SerializedName("mapping")
  private V1Mapping mapping = null;

  public V1Parallel random(V1RandomSearch random) {
    this.random = random;
    return this;
  }

   /**
   * Get random
   * @return random
  **/
  @ApiModelProperty(value = "")
  public V1RandomSearch getRandom() {
    return random;
  }

  public void setRandom(V1RandomSearch random) {
    this.random = random;
  }

  public V1Parallel grid(V1GridSearch grid) {
    this.grid = grid;
    return this;
  }

   /**
   * Get grid
   * @return grid
  **/
  @ApiModelProperty(value = "")
  public V1GridSearch getGrid() {
    return grid;
  }

  public void setGrid(V1GridSearch grid) {
    this.grid = grid;
  }

  public V1Parallel hyperband(V1Hyperband hyperband) {
    this.hyperband = hyperband;
    return this;
  }

   /**
   * Get hyperband
   * @return hyperband
  **/
  @ApiModelProperty(value = "")
  public V1Hyperband getHyperband() {
    return hyperband;
  }

  public void setHyperband(V1Hyperband hyperband) {
    this.hyperband = hyperband;
  }

  public V1Parallel bayes(V1Bayes bayes) {
    this.bayes = bayes;
    return this;
  }

   /**
   * Get bayes
   * @return bayes
  **/
  @ApiModelProperty(value = "")
  public V1Bayes getBayes() {
    return bayes;
  }

  public void setBayes(V1Bayes bayes) {
    this.bayes = bayes;
  }

  public V1Parallel hyperopt(V1Hyperopt hyperopt) {
    this.hyperopt = hyperopt;
    return this;
  }

   /**
   * Get hyperopt
   * @return hyperopt
  **/
  @ApiModelProperty(value = "")
  public V1Hyperopt getHyperopt() {
    return hyperopt;
  }

  public void setHyperopt(V1Hyperopt hyperopt) {
    this.hyperopt = hyperopt;
  }

  public V1Parallel iterative(V1Iterative iterative) {
    this.iterative = iterative;
    return this;
  }

   /**
   * Get iterative
   * @return iterative
  **/
  @ApiModelProperty(value = "")
  public V1Iterative getIterative() {
    return iterative;
  }

  public void setIterative(V1Iterative iterative) {
    this.iterative = iterative;
  }

  public V1Parallel mapping(V1Mapping mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  @ApiModelProperty(value = "")
  public V1Mapping getMapping() {
    return mapping;
  }

  public void setMapping(V1Mapping mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Parallel v1Parallel = (V1Parallel) o;
    return Objects.equals(this.random, v1Parallel.random) &&
        Objects.equals(this.grid, v1Parallel.grid) &&
        Objects.equals(this.hyperband, v1Parallel.hyperband) &&
        Objects.equals(this.bayes, v1Parallel.bayes) &&
        Objects.equals(this.hyperopt, v1Parallel.hyperopt) &&
        Objects.equals(this.iterative, v1Parallel.iterative) &&
        Objects.equals(this.mapping, v1Parallel.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(random, grid, hyperband, bayes, hyperopt, iterative, mapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Parallel {\n");
    
    sb.append("    random: ").append(toIndentedString(random)).append("\n");
    sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
    sb.append("    hyperband: ").append(toIndentedString(hyperband)).append("\n");
    sb.append("    bayes: ").append(toIndentedString(bayes)).append("\n");
    sb.append("    hyperopt: ").append(toIndentedString(hyperopt)).append("\n");
    sb.append("    iterative: ").append(toIndentedString(iterative)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
