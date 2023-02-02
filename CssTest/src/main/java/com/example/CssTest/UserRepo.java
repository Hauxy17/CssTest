package com.example.CssTest;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAllByOrderByFirstNameDesc();

    List<User> findAllByOrderByFirstName();

}
