package com.example.artem.task1.springboot.mapper;

import com.example.artem.task1.springboot.dto.StudentGetDto;
import com.example.artem.task1.springboot.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.Period;

@Mapper(componentModel = "spring")
public interface StudentGetMapper {

    StudentGetMapper INSTANCE = Mappers.getMapper(StudentGetMapper.class);

    @Mapping(target ="age",source = "dateOfBirth", qualifiedByName = "toAge")
    StudentGetDto toStudentGetDto (Student student);

    @Named("toAge")
    default int toAge(LocalDate dateOfBirth){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
