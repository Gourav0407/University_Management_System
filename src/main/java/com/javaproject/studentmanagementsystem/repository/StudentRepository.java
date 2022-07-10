package com.javaproject.studentmanagementsystem.repository;

import com.javaproject.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
