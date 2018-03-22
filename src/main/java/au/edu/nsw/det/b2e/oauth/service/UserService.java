package au.edu.nsw.det.b2e.oauth.service;

import java.util.List;

import au.edu.nsw.det.b2e.oauth.model.User;



public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
}
