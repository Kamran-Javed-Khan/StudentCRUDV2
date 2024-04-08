package com.example.demo.controller;

import com.example.demo.dto.StudentCreateDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/student/v2")
public class StudentController {
    StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentEntity> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(path = "{id}")
    public StudentEntity getStudentById(@PathVariable("id") Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
//    public void addStudent(@RequestBody StudentEntity studentEntity) {
    public void addStudent(@RequestBody StudentCreateDTO studentCreateDTO) {
        studentService.addStudent(studentCreateDTO);
    }
}
