package com.example.demo.service.impl;

import com.example.demo.dao.StudentRepository;
import com.example.demo.dto.StudentCreateDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository;
    StudentMapper studentMapper;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("Student with id : " + id + " not found.")
        );
    }

    @Override
    public void addStudent(StudentCreateDTO studentCreateDTO) {
        StudentEntity studentEntity = studentMapper.studentDTOToStudent(studentCreateDTO);
        studentRepository.save(studentEntity);
    }
}
