package com.accenture.spring.data.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//show database using localhost:8080/people uri
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends JpaRepository <Person, Long>{

	List<Person> findByLastName(@Param("lastname") String lastname);
	List<Person> findByFirstNameNotLike(@Param("firstname") String firstname);
}
