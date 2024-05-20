package com.sky.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sky.entities.Admin;
import com.sky.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>
{
public User findUserByUemail(String email);
}
