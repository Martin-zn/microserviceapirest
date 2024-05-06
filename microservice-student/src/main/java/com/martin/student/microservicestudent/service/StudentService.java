package com.martin.student.microservicestudent.service;

import com.martin.student.microservicestudent.entities.Student;

import java.util.List;

public interface StudentService {

    Iterable<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    List<Student> findByCourseId(Long courseId);

}
