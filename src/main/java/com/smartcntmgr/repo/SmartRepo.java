package com.smartcntmgr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.smartcntmgr.entity.*;
@Repository
public interface SmartRepo extends JpaRepository<User,Long>{

	@Query("select u from users u where email = :email") 
	public User GetUserbyEmailId(@Param("email") String email);
}
