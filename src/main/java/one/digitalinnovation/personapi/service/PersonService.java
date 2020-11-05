package one.digitalinnovation.personapi.service;

import org.springframework.stereotype.Service;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;

@Service
public class PersonService {
	
	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public MessageResponseDTO create(Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO
				.builder().message("Created person with id " + savedPerson.getId())
				.build();
	}

}
