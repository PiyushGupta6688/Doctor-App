package com.doctor.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.doctor.mail.MailSend;

import jakarta.persistence.EntityManager;

@Repository
public class AdminRepo {
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	MailSend ms;
	
	
}
