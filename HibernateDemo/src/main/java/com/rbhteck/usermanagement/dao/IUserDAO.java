package com.rbhteck.usermanagement.dao;
import java.util.*;
import com.rbhteck.usermanagement.model.User;

public interface IUserDAO {

	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public User getUser(int id);
	public List < User > getAllUser();
	
}
