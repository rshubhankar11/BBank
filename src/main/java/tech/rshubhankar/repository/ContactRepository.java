package tech.rshubhankar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tech.rshubhankar.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {


}
