package com.pkrull.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pkrull.Models.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
	List<Publisher> findAll();
}
