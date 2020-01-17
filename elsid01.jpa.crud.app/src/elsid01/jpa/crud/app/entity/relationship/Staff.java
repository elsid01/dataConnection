package elsid01.jpa.crud.app.entity.relationship;

import java.util.ArrayList;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

@Table

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "type")

public class Staff {

	







	@Id

	@Column

	private int sid;

	@Basic

	@Column

	private String sname;
@Basic
@Column
    private ArrayList<Integer> phone;


//Constructors
public Staff() {
	super();
	// TODO Auto-generated constructor stub
}


	public Staff(int sid, String sname, ArrayList<Integer> phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.phone = phone;
	}



	//Getters and setters
	public int getSid() {
		return sid;
	}






	public void setSid(int sid) {
		this.sid = sid;
	}






	public String getSname() {
		return sname;
	}






	public void setSname(String sname) {
		this.sname = sname;
	}






	public ArrayList<Integer> getPhone() {
		return phone;
	}






	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sname=" + sname + ", phone=" + phone + "]";
	}



	








}





