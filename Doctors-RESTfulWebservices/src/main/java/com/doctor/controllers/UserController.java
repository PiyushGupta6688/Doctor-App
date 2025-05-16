package com.doctor.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.doctor.models.Doctor;
import com.doctor.models.User;
import com.doctor.services.UserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public boolean register(@RequestBody User user) {
		return userService.register(user);
	}
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@PutMapping("/updatePhoto/{email}")
	public boolean updatePhoto(@PathVariable String email,@RequestBody byte[] photo) {
		return userService.updatePhoto(email, photo);
	}
	@PutMapping(value = {"/updatePassword","/forgetPassword"})
	public boolean updatePassword(@RequestBody Map<String, String> data) {
		String email=data.get("email");
		String newPassword=data.get("newPassword");
		return userService.updatePassword(email,newPassword);
	}
	@GetMapping("/getUser/{email}")
	public User getUser(@PathVariable String email) {
		return userService.getUser(email);
	}

	@GetMapping("/getPhoto/{email}")
	public byte[] getPhoto(@PathVariable String email) {
		return userService.getPhoto(email);
	}
	
}
