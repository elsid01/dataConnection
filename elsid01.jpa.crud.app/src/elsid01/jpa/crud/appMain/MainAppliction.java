package elsid01.jpa.crud.appMain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import elsid01.jpa.crud.app.dao.UserProfileDAO;
import elsid01.jpa.crud.app.entities.UserProfile;
import elsid01.jpa.crud.app.services.UserServices;

public class MainAppliction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//handlerCreateUser();
		//handlerRemoveUser();
		//handlerEditUser(301);
		//handlerShowUserById(301);
		handlerShowAllUsers();
		
       
	}

	

	private static void handlerShowAllUsers() throws ClassNotFoundException, SQLException {
		
		UserServices us = new UserServices();
		List<UserProfile> usersList = new ArrayList<UserProfile>();
	usersList =	us.showAll();
		
	}



	private static void handlerShowUserById(int userId) throws ClassNotFoundException, SQLException {
		UserServices userService = new UserServices();
		UserProfile userFound = userService.showUserById(userId);
		
		
		
	}



	private static void handlerEditUser(int currentUserId) throws ClassNotFoundException, SQLException {
		UserServices userService = new UserServices();
		//find the user
		UserProfile currentUser= userService.findUser(301);
		if(currentUser != null) {
		//we have the user user with updated input
		UserProfile userToBeUpdated = new UserProfile(301,"Demba","Diallo","@Demba","dembadiallo","654diall0");
		userService.editUser(userToBeUpdated);
		}else {
			System.out.println("RETURN THE ERROR WEBPAGE");
		}
		
	}

	private static void handlerRemoveUser() throws ClassNotFoundException, SQLException {
	UserServices userService = new UserServices();
	userService.removeUser(2);
		
	}

 	private static void handlerCreateUser() throws ClassNotFoundException, SQLException {
		UserServices userService = new UserServices();
		userService.createUser(new UserProfile(301,"samba","aliou","@samba","sambaAliou","2345aliou"));
		
	}

}
