package com.accenture.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	/*
	 * when spring creates an instance of topicservice, it's gonna inject
	 * an instance of topic repository to it through @Autowired
	 */
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		//return topics;
		
		//this is of iterable type
		
		return (List<Topic>)topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
//		for(int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}
