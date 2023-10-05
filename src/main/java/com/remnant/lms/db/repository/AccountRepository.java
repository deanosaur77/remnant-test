package com.remnant.lms.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.remnant.lms.db.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

}
