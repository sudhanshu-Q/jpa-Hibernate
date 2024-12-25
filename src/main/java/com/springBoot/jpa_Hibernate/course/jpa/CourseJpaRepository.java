package com.springBoot.jpa_Hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springBoot.jpa_Hibernate.hib.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}
	//to find one id
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
	//to delete one id
	public void deleteById(int id) {
		Course course= entityManager.find(Course.class, id);
		entityManager.remove(course);
		
	}
}
