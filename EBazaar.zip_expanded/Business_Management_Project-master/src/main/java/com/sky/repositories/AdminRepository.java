package com.sky.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sky.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
	public Admin findByAdminEmail(String email);
}
