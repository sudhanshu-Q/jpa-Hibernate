package com.springBoot.jpa_Hibernate.hib.course.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBoot.jpa_Hibernate.course.jpa.CourseJpaRepository;
import com.springBoot.jpa_Hibernate.hib.course.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner{

	
	@Autowired
	private CourseSpringJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	repository.insert();
		repository.save(new Course(1, "python", "ffdf"));
		repository.save(new Course(2, "java", "sdsds"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findByAuthor("sdsds"));
		System.out.println(repository.findByAuthor("sdhsahjasfas"));
	}

}

