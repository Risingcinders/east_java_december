package com.pkrull.Repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pkrull.Models.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
	List<Author> findAll();
}
