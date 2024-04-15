package tech.ada.school.management.domain.mappers;

import tech.ada.school.management.domain.dto.v1.StudentDTO;
import tech.ada.school.management.domain.entities.Student;

public class StudentMapper {

    public static Student toEntity(StudentDTO dto) {
        return new Student(
                dto.getCreatedAt(),
                dto.getId(),
                dto.getName()
        );
    }

    public static StudentDTO toDto(Student entity) {
        return new StudentDTO(
                entity.getCreatedAt(),
                entity.getId(),
                entity.getName()
        );
    }
}