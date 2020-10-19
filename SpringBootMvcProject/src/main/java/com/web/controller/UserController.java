package com.web.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.dao.UserDaoService;
import com.web.model.User;

@RestController
public class UserController {
	@Autowired
	UserDaoService    service;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello User...";
	}
	
	@GetMapping(value="/users" , produces= {"application/json","application/xml"})
	public List<User>  reteriveAllUsers(){
		return  service.findAll();
	}
	
	
	@GetMapping("/users/{id}")
	public User  reteriveUser(@PathVariable Integer id){
		return  service.findOne(id);
	}
	
	
	@PostMapping("/users")
	public User  saveUser(@RequestBody  User user){
		User savedUser= service.save(user);
		return  savedUser;
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable Integer id){
		service.deleteUser(id);
		return "User deleted " +id;
	}
	
	

	
	
	
}
