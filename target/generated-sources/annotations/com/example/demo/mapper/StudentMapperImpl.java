package com.example.demo.mapper;

import com.example.demo.dto.StudentCreateDTO;
import com.example.demo.entity.StudentEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-11T17:00:11+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentEntity studentDTOToStudent(StudentCreateDTO studentCreateDTO) {
        if ( studentCreateDTO == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName( studentCreateDTO.getStudentName() );

        return studentEntity;
    }
}
