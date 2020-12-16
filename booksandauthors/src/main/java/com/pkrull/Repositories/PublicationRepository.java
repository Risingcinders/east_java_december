package com.pkrull.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pkrull.Models.Publication;

@Repository
public interface PublicationRepository extends CrudRepository<Publication, Long> {
	List<Publication> findAll();
}
