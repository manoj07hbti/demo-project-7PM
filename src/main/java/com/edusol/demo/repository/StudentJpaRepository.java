package com.edusol.demo.repository;

import com.edusol.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student,Long> {
}
