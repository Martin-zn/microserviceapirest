package com.martin.curse.microservicecurse.service;

import com.martin.curse.microservicecurse.client.StudenClient;
import com.martin.curse.microservicecurse.dto.StudentDTO;
import com.martin.curse.microservicecurse.entities.Course;
import com.martin.curse.microservicecurse.http.response.StudentByCourseResponse;
import com.martin.curse.microservicecurse.repositories.CourseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRespository courseRespository;

    @Autowired
    private StudenClient studenClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRespository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRespository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRespository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {
        Course course = courseRespository.findById(idCourse).orElseThrow();

        List<StudentDTO> studentDTOList = studenClient.findAllStudentByCourse(course.getId());
        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeachername())
                .studentDTOList(studentDTOList)
                .build();
    }
}
