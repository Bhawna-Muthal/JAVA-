package com.exponent.UserService;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exponent.Entity.User;
import com.exponent.UserController.UserController;
import com.exponent.UserRepository.UserReposit;

//All business logics represent here
@Service
public class UserServiceIMPL implements UserService {

	Logger logger = LoggerFactory.getLogger(UserServiceIMPL.class);

	@Autowired
	private UserReposit ur;

	@Override
	public int addUser(User user) {

		logger.info("I am in Service layer");
		logger.info("Data : " + user);

		if (user != null) {
			ur.save(user);

			logger.info("user added successfully");
			return 1;
		}
		return 0;
	}

	@Override
	public List<User> getAllUsersFromService() {

		List<User> allUsers = ur.findAll();

		if (allUsers != null) {

			return allUsers;
		}
		return null;
	}

	@Override
	public User getUserByIDInService(String id) {

		Optional<User> user = ur.findById(id);

		if (user.isPresent()) {

			return user.get();
		}
		return null;
	}

	@Override
	public int updateUserInService(User user) {

		User u = ur.save(user);

		if (u != null) {

			return 1;
		}
		return 0;
	}

	@Override
	public int deleteUserByIdinService(String id) {
		ur.deleteById(id);
		if (ur.findById(id).isPresent()) {
			return 0;
		}
		return 1;
	}

}
