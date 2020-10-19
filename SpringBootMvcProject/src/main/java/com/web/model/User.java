package com.web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	
	@OneToMany(mappedBy="user")
	private List<Post> post;
	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public List<Post> getPost() {
		return post;
	}


	public void setPost(List<Post> post) {
		this.post = post;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	

}
