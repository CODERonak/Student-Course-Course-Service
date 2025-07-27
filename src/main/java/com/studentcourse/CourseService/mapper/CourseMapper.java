package com.studentcourse.CourseService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.studentcourse.CourseService.dto.CourseRequest;
import com.studentcourse.CourseService.dto.CourseResponse;
import com.studentcourse.CourseService.model.Course;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    @Mapping(target = "id", ignore = true)
    Course toEntity(CourseRequest request);

    CourseResponse toResponse(Course course);
}