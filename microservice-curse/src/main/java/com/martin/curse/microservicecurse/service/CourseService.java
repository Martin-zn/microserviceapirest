package com.martin.curse.microservicecurse.service;

import com.martin.curse.microservicecurse.entities.Course;
import com.martin.curse.microservicecurse.http.response.StudentByCourseResponse;

import java.util.List;

public interface CourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);

}
