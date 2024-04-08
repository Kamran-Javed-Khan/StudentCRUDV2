package com.example.demo.service;

import com.example.demo.dto.StudentCreateDTO;
import com.example.demo.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    public List<StudentEntity> getStudents();
    public StudentEntity getStudentById(Integer id);

    public void addStudent(StudentCreateDTO studentCreateDTO);
}
