package com.remnant.lms.db.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.remnant.lms.db.entity.Address;
import com.remnant.lms.db.entity.Client;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

	public Optional<Address> findByStreet(String street);

}
