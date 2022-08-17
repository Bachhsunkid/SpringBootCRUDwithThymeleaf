package com.example.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	public Long countById(Integer id); //custom nhung theo tieu chuan cua data jpa
}
