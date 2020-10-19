package com.web.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.model.User;

@Service
public class UserDaoService {
	
	private static List<User> users= new ArrayList<>();
	
	static {
		users.add(new User(1,"Adam","a@gmail.com"));
		users.add(new User(2,"Eve","e@gmail.com"));
		users.add(new User(3,"Jack","j@gmail.com"));
	}	
	
	public List<User> findAll(){
		return users;
	}
	

	
	public User findOne(int id) {
	for(User user:users) {
	if(user.getId()==id)
	return user;
	}
	return null;
	}

	 
	
	public User save(User user) {
		users.add(user);
		return user;
	}

	public void deleteUser(int id) {
		Iterator<User>  itr=users.iterator();
		while(itr.hasNext()) {
			User u= itr.next();
			if(u.getId()==id)
			itr.remove();
		}
	}
	
	
	
	

}


