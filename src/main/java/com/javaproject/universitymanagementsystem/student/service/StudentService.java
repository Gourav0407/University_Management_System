package com.javaproject.universitymanagementsystem.student.service;

import com.javaproject.universitymanagementsystem.student.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudents(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
