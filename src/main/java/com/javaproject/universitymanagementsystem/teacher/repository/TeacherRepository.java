package com.javaproject.universitymanagementsystem.teacher.repository;

import com.javaproject.universitymanagementsystem.teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
