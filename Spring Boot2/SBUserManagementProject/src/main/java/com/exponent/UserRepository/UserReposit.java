package com.exponent.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exponent.Entity.User;

@Repository
public interface UserReposit extends JpaRepository<User, String> {

}
