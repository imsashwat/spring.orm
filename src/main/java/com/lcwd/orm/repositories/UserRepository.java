package com.lcwd.orm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lcwd.orm.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {

}
