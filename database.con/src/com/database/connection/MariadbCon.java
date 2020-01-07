package com.database.connection;

import java.awt.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Models.Users;

public class MariadbCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/classicmodels","root","");

		if(con.isValid(0)) {
			System.out.println("CONNECTION IS READY");

		}


		java.sql.Statement som =  con.createStatement();

		ResultSet rs=	som.executeQuery("Select * from offices");

        
		ArrayList<Users> userList = new ArrayList<Users>();

		while(rs.next()) {
			Users user = new Users();
			//		System.out.print(rs.getString(1));
			//		System.out.print(rs.getString(2));
			//		System.out.print(rs.getString(3));
			//		System.out.print(rs.getString(4));
			//		System.out.print(rs.getString(5));
			//		System.out.print(rs.getString(6));
			//		System.out.print(rs.getString(7));
			//		System.out.println();
			//          

			user.setOffiCode( rs.getString(1));
			user.setCity( rs.getString(2));
			user.setPhone(rs.getString(3));
			user.setAddressLine1(rs.getString(4));
			user.setAddressLine2(rs.getString(5));
			user.setState(rs.getString(6));
			user.setCountry(rs.getString(7));
			user.setPostalCode(rs.getString(7));
			user.setTerritory(rs.getString(7));
			rs.getRow();

			
			userList.add(user);
			}
			
	
			for (Users users: userList) {
				printUser(users, users.getOffiCode());
			}

		//close the connection
		con.close();
	}

	private static void printUser(Users user, String n) {
		System.out.println( n + " " + user.toString());
		
	}

}
