package com.javaproject.studentmanagementsystem.service;

import com.javaproject.studentmanagementsystem.controller.StudentController;
import com.javaproject.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudents(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
}
