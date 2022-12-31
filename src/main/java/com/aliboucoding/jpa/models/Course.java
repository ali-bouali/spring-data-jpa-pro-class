package com.aliboucoding.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course {

  @Id
  @GeneratedValue
  private Integer id;

  private String title;

  private String description;

  @ManyToMany
  @JoinTable(
      name = "authors_courses",
      joinColumns = {
          @JoinColumn(name = "course_id")
      },
      inverseJoinColumns = {
          @JoinColumn(name = "author_id")
      }
  )
  private List<Author> authors;

  @OneToMany(mappedBy = "course")
  private List<Section> sections;

}
