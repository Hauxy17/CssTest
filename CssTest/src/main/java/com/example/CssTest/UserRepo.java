package com.example.CssTest;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
//import org.springframework.stereotype.Service;


//@Service
public interface UserRepo extends CrudRepository<UserProfile, Long> {

    @Query(value = "SELECT * FROM USERPROFILE WHERE USER_NAME = ?1 AND PASSWORD = ?2", nativeQuery = true)
    public UserProfile login(
            String username,
            String password);


    Optional<UserProfile> findByUsernameAndPassword(
            String username,
            String password);


}
