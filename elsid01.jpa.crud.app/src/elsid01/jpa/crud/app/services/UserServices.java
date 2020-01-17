package elsid01.jpa.crud.app.services;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import elsid01.jpa.crud.app.dao.UserProfileDAO;
import elsid01.jpa.crud.app.entities.UserProfile;

public class UserServices {
public void createUser(UserProfile user) throws ClassNotFoundException, SQLException {
	 int result = 0;
	UserProfileDAO userDAO = new UserProfileDAO();
	result = userDAO.insertUser(user);
	if(result==1) {
		System.out.println("Do More here");
		System.out.println("Congrats User saved");
		
	}else {
		System.out.println("Do More here");
		System.out.println("It Fail");
	}
	
}

public void removeUser(int userId) throws ClassNotFoundException, SQLException {
	
	 int result = 0;
		UserProfileDAO userDAO = new UserProfileDAO();
		result = userDAO.deleteUserById(userId);
		if(result==1) {
			System.out.println("Do More here");
			System.out.println("Congrats User saved");
			
		}else {
			System.out.println("Do More here");
			System.out.println("It Fail");
		}
		
}
public void editUser(UserProfile user) throws ClassNotFoundException, SQLException {
		
		
			UserProfileDAO userDAO = new UserProfileDAO();
			 int result = userDAO.updateUser(user);
			
			if(result==1) {
				System.out.println("Do More here");
				System.out.println("Congrats User saved");
				
			}else {
				System.out.println("Do More here");
				System.out.println("It Fail");
			}
}
public UserProfile findUser(int userId) throws ClassNotFoundException, SQLException {
	//dao
		UserProfileDAO userDAO = new UserProfileDAO();
	return userDAO.getUserById(userId);
		
		
}
public UserProfile showUserById(int userId) throws ClassNotFoundException, SQLException {
	UserProfileDAO userDAO = new UserProfileDAO();
	UserProfile userFound = userDAO.getUserById(userId);
	if(userFound!=null) {
		printUser(userFound);
			
		
	}
	return userFound;
	
}
private void printUser(UserProfile user) {
	System.out.println(user.toString());
	
}

public List<UserProfile> showAll() throws ClassNotFoundException, SQLException {
	List<UserProfile> userList = new ArrayList<UserProfile>();
	UserProfileDAO upd= new UserProfileDAO();
	userList=upd.getAllUser();
	if(userList!=null) {
		printAllUsers(userList);
	}else {
		System.out.println("Error");
	}
	
	return null;
	
}

private void printAllUsers(List<UserProfile> userList) {
	for(UserProfile u: userList) {
		System.out.println(u.toString());
	}
	
}
}
