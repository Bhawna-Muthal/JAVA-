package com.exponent.UserController;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exponent.Entity.User;
import com.exponent.UserService.UserService;

@RestController // Because we have to make rest APIs
@RequestMapping("/exponent/api")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService us;

	@PostMapping("/UserAdd")
	public ResponseEntity<?> userAddController(@RequestBody User user) {

		logger.info("UserData is" + user);

		int result = us.addUser(user);

		if (result > 0) {

			return new ResponseEntity("User added successfully", HttpStatus.OK);

		}
		return new ResponseEntity("User not valid ", HttpStatus.NOT_FOUND);

	}

	@PostMapping("/getAllUsers")
	public ResponseEntity<?> getAllUser() {
		List<User> allUsers = us.getAllUsersFromService();

		if (allUsers != null) {

			return new ResponseEntity(allUsers, HttpStatus.OK);
		}

		return new ResponseEntity("User not valid ", HttpStatus.NOT_FOUND);

	}

	@GetMapping("/getUserById/{id}")
	public ResponseEntity<?> getUserByID(@PathVariable String id) {

		logger.info("I am in controller ");
		User user = us.getUserByIDInService(id);

		if (user != null) {

			return new ResponseEntity(user, HttpStatus.OK);
		}
		return new ResponseEntity("User not valid ", HttpStatus.NOT_FOUND);
	}

	@GetMapping("/updateUser")
	public ResponseEntity<?> updateUserDetails(@RequestBody User user) {

		logger.info("I am in controller ");
		int result = us.updateUserInService(user);

		if (result > 0) {

			return new ResponseEntity(user, HttpStatus.OK);
		}
		return new ResponseEntity("User not valid ", HttpStatus.NOT_MODIFIED);
	}

	@GetMapping("/deleteBy/{id}")
	public ResponseEntity<?> deleteById(@RequestBody User user) {

		logger.info("I am in controller ");

		int result = us.deleteUserByIdinService(id);

		if (result > 0) {

			return new ResponseEntity(user, HttpStatus.OK);
		}
		return new ResponseEntity("User not valid ", HttpStatus.NO_CONTENT);

	}

}
