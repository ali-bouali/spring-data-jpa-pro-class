package com.aliboucoding.jpa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

import lombok.*;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQueries(
        {
          @NamedQuery(
                  name = "Author.findByNamedQuery",
                  query = "select a from Author a where a.age >= :age"
          ),
          @NamedQuery(
                  name = "Author.updateByNamedQuery",
                  query = "update Author a set a.age = :age"
          )
        }
)
public class Author extends BaseEntity {

  private String firstName;

  private String lastName;

  @Column(
      unique = true,
      nullable = false
  )
  private String email;

  private int age;

  @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
  @JsonIgnore
  private List<Course> courses;

}
