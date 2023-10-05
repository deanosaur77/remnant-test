package com.remnant.lms.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.remnant.lms.db.entity.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
