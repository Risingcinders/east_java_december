package com.pkrull.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.pkrull.Models.Publisher;
import com.pkrull.Repositories.PublisherRepository;

@Service
public class PublisherService {
	public final PublisherRepository publisherRepository;
	
	public PublisherService(PublisherRepository publisherRepository) {
		this.publisherRepository = publisherRepository;
	}

	public void addPublisher(@Valid Publisher publisher) {
		// TODO Auto-generated method stub
		publisherRepository.save(publisher);
		
	}

	public List<Publisher> allPublishers() {
		// TODO Auto-generated method stub
		return publisherRepository.findAll();
	}

}
