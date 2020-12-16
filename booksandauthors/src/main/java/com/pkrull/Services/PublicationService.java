package com.pkrull.Services;

import org.springframework.stereotype.Service;

import com.pkrull.Models.Publication;
import com.pkrull.Repositories.PublicationRepository;

@Service
public class PublicationService {
	private final PublicationRepository publicationRepository;
	
	public PublicationService(PublicationRepository publicationRepository) {
		this.publicationRepository = publicationRepository;
	}
	
	public void createPublication(Publication publication) {
		publicationRepository.save(publication);
	}

}
