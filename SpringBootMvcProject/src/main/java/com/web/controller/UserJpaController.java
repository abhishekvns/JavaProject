package com.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Post;
import com.web.model.User;
import com.web.repository.PostRepository;
import com.web.repository.UserRepository;

@RestController
public class UserJpaController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PostRepository postRepo;
	
	@GetMapping("jpa/users")
	List<User> getAllUsers(){
		
		return userRepo.findAll();
	}

	
	@GetMapping("jpa/users/{id}")
	public User getUser(@PathVariable Integer id) {
		Optional<User> user=userRepo.findById(id);
				return user.get();
	}
	@PostMapping("jpa/users")
	public User createUser(@RequestBody User user) {
		User userSaved=userRepo.save(user);
				return userSaved;
	}
	@GetMapping("jpa/users/{id}/posts")
	List<Post> getAllPosts(@PathVariable Integer id){
	Optional<User> userOp=userRepo.findById(id);	
	return userOp.get().getPost();

	}

}
