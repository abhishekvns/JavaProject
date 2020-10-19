package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
