package com.exponent.UserService;

import java.util.List;

import com.exponent.Entity.User;

public interface UserService {

	public int addUser(User user);

	public List<User> getAllUsersFromService();

	public User getUserByIDInService(String id);

	public int updateUserInService(User user);

	public int deleteUserByIdinService(String id);

}
