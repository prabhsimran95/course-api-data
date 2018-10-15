package com.spring.courseapidata.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			   new Topic("java", "Core java", "Core Java Description"),
			   new Topic("javascript", "javascript", "javascript description")
));

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(t -> topics.add(t));
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public Topic getTopic(String id) {
	return topicRepository.findById(id).get();
		
	}
	
	public void updatetopic(Topic topic) {
		topicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
	
	
}
