package com.javaproject.universitymanagementsystem;

import com.javaproject.universitymanagementsystem.student.repository.StudentRepository;
import com.javaproject.universitymanagementsystem.teacher.entity.Teacher;
import com.javaproject.universitymanagementsystem.student.entity.Student;
import com.javaproject.universitymanagementsystem.teacher.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityManagementSystemApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(UniversityManagementSystemApplication.class, args);
    }
    private StudentRepository studentRepository;

    private TeacherRepository teacherRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student0=new Student("Gourav","Choudhary","gourav@gmail.com");
//        studentRepository.save(student0);
//        Teacher teacher0=new Teacher("ranvir","singh","ranvir@gmail.com");
//        teacherRepository.save(teacher0);
    }
}
