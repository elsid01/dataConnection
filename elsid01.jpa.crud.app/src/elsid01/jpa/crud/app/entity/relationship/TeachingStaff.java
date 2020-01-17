package elsid01.jpa.crud.app.entity.relationship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")
public class TeachingStaff extends Staff {

	
	
	private String qualification;
	
	private String subjectExpertise;
    
	private List<Certificate> certOb;
	
	//constructors

	
public TeachingStaff() {
	super();
}
	public TeachingStaff(int sid, String sname, ArrayList<Integer> phone) {
		super(sid, sname, phone);
		
	}

	

	public TeachingStaff(int sId,String qualification, String subjectExpertise,  ArrayList<Integer> phoneList, List<Certificate> certOb) {
		super();
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
		this.certOb = certOb;
	}
	
//Getters and setters

	public TeachingStaff(int j, String string, String string2, String string3, ArrayList<Integer> phoneList,
			 List<Certificate> certOb) {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectExpertise() {
		return subjectExpertise;
	}

	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}

	public List<Certificate> getCertOb() {
		return certOb;
	}

	public void setCertOb(List<Certificate> certOb) {
		this.certOb = certOb;
	}


	








}