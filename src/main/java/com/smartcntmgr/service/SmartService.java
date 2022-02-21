package com.smartcntmgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.smartcntmgr.entity.*;
import com.smartcntmgr.repo.*;
public class SmartService {
	
	@Autowired
	private SmartRepo smartRepo;
	
	public void Savetodb(User user) {
		smartRepo.save(user);
	}
	
	public User Getuserbyemailid(String email) {	
		return smartRepo.GetUserbyEmailId(email);
	}
}

