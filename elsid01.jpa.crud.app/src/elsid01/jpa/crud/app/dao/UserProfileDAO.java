package elsid01.jpa.crud.app.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import elsid01.jpa.crud.app.entities.UserProfile;

public class UserProfileDAO implements UserProfileDAOI {
private final String jpaUnitName="elsid01.jpa.crud.appFactory";
	@Override
	public int insertUser(UserProfile user) throws SQLException, ClassNotFoundException {
		int result = 0;
		try {
		//1. Declare entity Factory manager and the entity manager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory(jpaUnitName);
		EntityManager em= emf.createEntityManager();
		//2. Transaction (CRUD)
           //a.begining
		em.getTransaction().begin();
		   //b. execute operation
		em.persist(user);
		   //c. commit 
		em.getTransaction().commit();
		//3. Close connection
		em.close();
		emf.close();
		result =1;
		}catch(PersistenceException pe) {
			result = 0;
			pe.printStackTrace();
		}
		finally {
			System.out.println("This always happen");
			if (result==1) {
				System.out.println("More steps");
			}
		}

		return 0;
	}

	@Override
	public int deleteUserById(int userId) throws ClassNotFoundException, SQLException {
		
		int result = 0;
		try {
		//1. Declare entity Factory manager and the entity manager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory(jpaUnitName);
		EntityManager em= emf.createEntityManager();
		//2. Transaction (CRUD)
		 //a.begining
		em.getTransaction().begin();
		   //b. execute operation
		UserProfile findUser = em.find(UserProfile.class, userId);
		em.remove(findUser);
		
		   //c. commit 
		em.getTransaction().commit();
		//3. Close connection
		em.close();
		emf.close();
		}catch(PersistenceException pe) {
			result=0;
			pe.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateUser(UserProfile user) throws ClassNotFoundException, SQLException {
		int result =0;
		try {
		//1. Declare entity Factory manager and the entity manager
				EntityManagerFactory emf= Persistence.createEntityManagerFactory(jpaUnitName);
				EntityManager em= emf.createEntityManager();
				//2. Transaction (CRUD)
				 //a.begining
				em.getTransaction().begin();
				   //b. execute operation
				UserProfile findUser = em.find(UserProfile.class, user.getUserId());
				findUser.setFirstName(user.getFirstName());
				findUser.setLastName(user.getLastName());
				findUser.setEmail(user.getEmail());
				findUser.setUserName(user.getUserName());
				findUser.setPassword(user.getPassword());
				   //c. commit 
				em.getTransaction().commit();
				//3. Close connection
				em.close();
				emf.close();
		}catch(PersistenceException pe) {
			result =0;
			pe.printStackTrace();
		}
		return result;
	}

	@Override
	public UserProfile getUserById(int userId) throws ClassNotFoundException, SQLException {
		int result =0;
		UserProfile userfound = null;
		try {
		//1. Declare entity Factory manager and the entity manager
				EntityManagerFactory emf= Persistence.createEntityManagerFactory(jpaUnitName);
				EntityManager em= emf.createEntityManager();
				//2. Transaction (CRUD)
				   // execute operation
				userfound = em.find(UserProfile.class, userId);
				
				//3. Close connection
				em.close();
				emf.close();
		}catch(PersistenceException pe) {
			result =0;
			pe.printStackTrace();
		}
		return userfound ;
	}

	@Override
	public List<UserProfile> getAllUser() throws SQLException, ClassNotFoundException {
		//Declare an arrayList
		List<UserProfile> userList = new ArrayList<UserProfile>();
		//1. Declare entity Factory manager and the entity manager
		EntityManagerFactory emf= Persistence.createEntityManagerFactory(jpaUnitName);
		EntityManager em= emf.createEntityManager();
		
		Query query = em.createQuery("SELECT e FROM UserProfile e");
		
		 userList =  query.getResultList();
		
		for(UserProfile e : userList) {
			System.out.println(e.toString());
		}
		
		
		return userList;
	}

}
