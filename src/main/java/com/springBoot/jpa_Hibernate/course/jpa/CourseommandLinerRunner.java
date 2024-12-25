//package com.springBoot.jpa_Hibernate.course.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.springBoot.jpa_Hibernate.course.jdbc.CourseJdbcRepository;
//import com.springBoot.jpa_Hibernate.hib.course.Course;
//
//@Component
//public class CourseommandLinerRunner implements CommandLineRunner {
//
//	@Autowired
//	private CourseJpaRepository repository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//	//	repository.insert();
//		repository.insert(new Course(1, "python", "ffdf"));
//		repository.insert(new Course(2, "java", "sdsds"));
//		repository.deleteById(1);
//		System.out.println(repository.findById(2));
//
//	}
//
//}
