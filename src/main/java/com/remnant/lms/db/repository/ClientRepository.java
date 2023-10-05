package com.remnant.lms.db.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.remnant.lms.db.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	public Optional<Client> findByEmail(String email);

}
