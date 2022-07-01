package com.tweetapp.TweetApp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tweetapp.TweetApp.dto.UserResponse;
import com.tweetapp.TweetApp.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1.0/tweets")
public class UserController {
	private static final Logger log =LoggerFactory.getLogger(UserController.class);
	private UserMapper userMapper;

	public UserController(UserMapper mapper) {
		this.userMapper = mapper;
	}

	/* Get all users */
	@GetMapping("/users/all")
	public ResponseEntity<List<UserResponse>> getAllUsers() {
		log.info("inside getAllUsers method of UserController");
		return ResponseEntity.ok().body(userMapper.getAllUsers());
	}

	/* get user by username */
	@GetMapping("/user/search/{username}")
	public ResponseEntity<List<UserResponse>> getUser(@PathVariable("username") String username) {
		log.info("inside getUser method of UserController");
		return ResponseEntity.ok().body(userMapper.getUsers(username));
	}

}
