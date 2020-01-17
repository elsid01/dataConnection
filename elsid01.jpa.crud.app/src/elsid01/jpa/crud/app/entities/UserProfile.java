package elsid01.jpa.crud.app.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersProfile")
public class UserProfile {
	/*
	 * ANOTATION
	 * @Entity Tells JPA that this is a model to used as an Entity
	 * @Table tells JPA that this is based on a table .Name defines the name of the table it is based on
	 * @Id Tells the JPA the bellow variable is a primary key
	 * @Basic  Tells JPA the bellow variable is a regular attribute
	 * @Column Name defines the name of the column this variable is based on
	 */
	
	//Field
	@Id
	@Column(name="UserId")
	private int UserId;

	
	@Basic
	@Column(name="firstName")
	private String firstName;

	@Basic
	@Column(name="lastName")
	private String lastName;

	@Basic
	@Column(name="email")
	private String email;

	@Basic
	@Column(name="userName")
	private String userName;

	@Basic
	@Column(name="password")
	private String password;


	//constructor
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserProfile(int userId, String firstName, String lastName, String email, String userName,
			String password) {
		super();
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	//getters and setters
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//toString Method
	@Override
	public String toString() {
		return "UserProfile [UserId=" + UserId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", userName=" + userName + ", password=" + password + "]";
	}

}
