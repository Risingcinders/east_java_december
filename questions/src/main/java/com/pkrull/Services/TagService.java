package com.pkrull.Services;

import org.springframework.stereotype.Service;

import com.pkrull.Models.Tag;
import com.pkrull.Repositories.TagRepository;

@Service
public class TagService {
	private final TagRepository tagRepository;
	
	public TagService(TagRepository tRepository) {
		this.tagRepository = tRepository;
	}
	
	public Tag findTagBySubject(String subject) {
		return tagRepository.findBySubject(subject);
	}
	
	public Tag addTag(Tag t) {
		return tagRepository.save(t);
	}

}
