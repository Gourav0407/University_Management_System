package com.javaproject.universitymanagementsystem.student.repository;

import com.javaproject.universitymanagementsystem.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
