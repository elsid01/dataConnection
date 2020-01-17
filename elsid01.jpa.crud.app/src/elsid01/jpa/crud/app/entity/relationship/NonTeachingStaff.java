package elsid01.jpa.crud.app.entity.relationship;

import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value = "NS")

public class NonTeachingStaff extends Staff{





	private String areaExpertise;



	

	

	//constructor

	public NonTeachingStaff(int sid, String sname, String areaExpertise,ArrayList<Integer> phone) {

		super(sid, sname,phone);

		this.areaExpertise = areaExpertise;

	}



	



	public NonTeachingStaff() {

		super();

		// TODO Auto-generated constructor stub

	}





	public NonTeachingStaff(int sid, String sname,ArrayList<Integer> phone) {

		super(sid, sname,phone);

		// TODO Auto-generated constructor stub

	}



//Getters and setters

	public String getAreaExpertise() {

		return areaExpertise;

	}







	





	public void setAreaExpertise(String areaExpertise) {

		this.areaExpertise = areaExpertise;

	}

	

	



}
