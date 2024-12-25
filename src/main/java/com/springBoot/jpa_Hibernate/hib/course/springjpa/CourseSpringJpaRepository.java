package com.springBoot.jpa_Hibernate.hib.course.springjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jpa_Hibernate.hib.course.Course;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);

}
