package com.test.trial.repository;

import com.test.trial.modl.User;
import org.springframework.data.repository.CrudRepository;

public interface HibernateRepo extends CrudRepository<User, Integer> {
}
