package com.javaproject.studentmanagementsystem.controller;

import com.javaproject.studentmanagementsystem.entity.Student;
import com.javaproject.studentmanagementsystem.repository.StudentRepository;
import com.javaproject.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handle student list and retun view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    //hold student form data
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.saveStudents(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_Student";
    }

    @PostMapping("/student/{id}")
    public  String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student, Model model){
        Student existingStudent=studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }
}
