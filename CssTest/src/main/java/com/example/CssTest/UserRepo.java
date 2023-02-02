package com.example.CssTest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//@Service
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAllByOrderByFirstNameDesc();

}
