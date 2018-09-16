package com.accenture.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	/*
	 * when spring creates an instance of topicservice, it's gonna inject
	 * an instance of topic repository to it through @Autowired
	 */
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllTopics() {
		//return topics;
		
		//this is of iterable type
		
		return (List<Course>)courseRepository.findAll();
	}

	public Course getCourse(String id) {
		
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		//topics.add(topic);
		
		courseRepository.save(topic);
		
	}

	public void updateCourse(String id, Course topic) {
//		for(int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
		courseRepository.save(topic);
		
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
}
