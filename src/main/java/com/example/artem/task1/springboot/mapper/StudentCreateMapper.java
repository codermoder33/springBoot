package com.example.artem.task1.springboot.mapper;

import com.example.artem.task1.springboot.dto.StudentCreateDto;
import com.example.artem.task1.springboot.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentCreateMapper {

    StudentCreateMapper INSTANCE = Mappers.getMapper(StudentCreateMapper.class);

    Student toStudent (StudentCreateDto student);

}
