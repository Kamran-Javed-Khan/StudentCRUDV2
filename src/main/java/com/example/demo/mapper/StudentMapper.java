package com.example.demo.mapper;

import com.example.demo.dto.StudentCreateDTO;
import com.example.demo.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {
//    StudentCreateDTO studentTorStudentDTO(StudentEntity studentEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "studentName")
    StudentEntity studentDTOToStudent(StudentCreateDTO studentCreateDTO);
}
