package com.martin.curse.microservicecurse.repositories;

import com.martin.curse.microservicecurse.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRespository extends CrudRepository<Course, Long> {
}
