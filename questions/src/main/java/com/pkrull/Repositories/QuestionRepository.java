package com.pkrull.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pkrull.Models.Question;

@Repository
public interface QuestionRepository  extends CrudRepository<Question, Long> {
	List<Question> findAll();
}
