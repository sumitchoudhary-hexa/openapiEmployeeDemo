package com.sumit.pack.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * this is the employee model
 */
@ApiModel(description = "this is the employee model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Employee   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("salary")
  private Integer salary;

  public Employee id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * the id of employee
   * @return id
  */
  @ApiModelProperty(value = "the id of employee")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of employee
   * @return name
  */
  @ApiModelProperty(value = "name of employee")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee salary(Integer salary) {
    this.salary = salary;
    return this;
  }

  /**
   * salary of employee
   * @return salary
  */
  @ApiModelProperty(value = "salary of employee")


  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.salary, employee.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, salary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

