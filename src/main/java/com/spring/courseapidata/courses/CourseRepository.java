package com.spring.courseapidata.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	
	// what we need is a method
	// which takes in a topicId that returns a list of courses
	// here Topic is the type of data which we need,
	// if it is present as an attribute in the same class then we just need attribute name eg, findByDescription
	// but here we need topic id and   id atribute is of type Topic that is why we will write findByTopicId
	
	public List<Course> findByTopicId(String topicId);
}
