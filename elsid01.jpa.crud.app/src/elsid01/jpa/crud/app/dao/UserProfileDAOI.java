package elsid01.jpa.crud.app.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import elsid01.jpa.crud.app.entities.UserProfile;

public interface UserProfileDAOI {
	/*
	 * 	return type are 0 means fail 1 or 
	 * greater than one means succeed and
	 *   represents the number of row affected
	 */
	public int insertUser(UserProfile user) throws SQLException, ClassNotFoundException;

	public int deleteUserById(int userId) throws ClassNotFoundException, SQLException;//document values : return and parameter

	public int updateUser(UserProfile user) throws ClassNotFoundException, SQLException;

	public UserProfile getUserById(int userId) throws ClassNotFoundException, SQLException;

	public List<UserProfile> getAllUser() throws SQLException, ClassNotFoundException;

}
