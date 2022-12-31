package com.aliboucoding.jpa.repositories;

import com.aliboucoding.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
