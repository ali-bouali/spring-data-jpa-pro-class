package com.aliboucoding.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {

  @Id
  @GeneratedValue
  private Integer id;

  private String firstName;

  private String lastName;

  @Column(
      unique = true,
      nullable = false
  )
  private String email;

  private int age;

}
