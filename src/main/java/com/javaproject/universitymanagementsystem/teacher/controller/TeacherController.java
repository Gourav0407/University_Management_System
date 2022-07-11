package com.javaproject.universitymanagementsystem.teacher.controller;

import com.javaproject.universitymanagementsystem.teacher.entity.Teacher;
import com.javaproject.universitymanagementsystem.teacher.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        super();
        this.teacherService = teacherService;
    }

    //handle teacher list and return view
    @GetMapping("/teachers")
    public String listTeachers(Model model){
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers";
    }

    //hold Teacher form data
    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model){
        Teacher teacher=new Teacher();
        model.addAttribute("teacher",teacher);
        return "create_teacher";
    }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher){
        teacherService.saveTeachers(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id,Model model){
        model.addAttribute("teacher", teacherService.getTeacherById(id));
        return "edit_teacher";
    }

    @PostMapping("/teachers/{id}")
    public  String updateTeacher(@PathVariable Long id , @ModelAttribute("teacher") Teacher teacher, Model model){
        Teacher existingTeacher= teacherService.getTeacherById(id);
        existingTeacher.setId(id);
        existingTeacher.setFirstName(teacher.getFirstName());
        existingTeacher.setLastName(teacher.getLastName());
        existingTeacher.setEmail(teacher.getEmail());

        teacherService.updateTeacher(existingTeacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/{id}")
    public String deleteTeacher(@PathVariable Long id){
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}
