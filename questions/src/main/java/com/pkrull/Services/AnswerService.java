package com.pkrull.Services;

import org.springframework.stereotype.Service;

import com.pkrull.Models.Answer;
import com.pkrull.Repositories.AnswerRepository;

@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository aRepository) {
		this.answerRepository = aRepository;
	}
	
	public Answer addAnswer(Answer answer) {
		return this.answerRepository.save(answer);
	}
}
