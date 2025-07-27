package com.studentcourse.CourseService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentcourse.CourseService.dto.CourseRequest;
import com.studentcourse.CourseService.dto.CourseResponse;
import com.studentcourse.CourseService.mapper.CourseMapper;
import com.studentcourse.CourseService.model.Course;
import com.studentcourse.CourseService.repository.CourseRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
    private final CourseMapper mapper;

    public CourseResponse createCourse(CourseRequest request) {
        Course course = mapper.toEntity(request);
        Course saved = courseRepository.save(course);
        return mapper.toResponse(saved);
    }

    public List<CourseResponse> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map(mapper::toResponse).toList();
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}