package com.pkrull.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pkrull.Models.Answer;

@Repository
public interface AnswerRepository  extends CrudRepository<Answer, Long> {
	List<Answer> findAll();
}
