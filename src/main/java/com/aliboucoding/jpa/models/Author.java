package com.aliboucoding.jpa.models;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Author {

  private Integer id;

  private String firstName;

  private String lastName;

  private String email;

  private int age;



}
