package com.pkrull.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pkrull.Models.Question;
import com.pkrull.Repositories.QuestionRepository;

@Service
public class QuestionService {
	
	private final QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository qRepository) {
		this.questionRepository = qRepository;
	}

	public Question addQuestion(Question q) {
		return questionRepository.save(q);
	}
	
	public List<Question> getAll() {
		return questionRepository.findAll();
	}
	
	public Question getQuestionById(Long id) {
		Optional<Question> quest = questionRepository.findById(id);
		if(quest.isPresent()) {
			return quest.get();
		} else {
			return null;
		}
	}
 }
