package elsid01.jpa.crud.app.entity.relationship;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
//@DiscriminatorValue(value = "CT")
public class Certificate implements Serializable{
	
/**
	 * 
	 */
	
//@Id	
private int Cid;
private String certName;
private String date;
private static final long serialVersionUID = 1L;
//Constructor
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}


public Certificate(int cid, String certName, String date) {
	super();
	Cid = cid;
	this.certName = certName;
	this.date = date;
}

//Getters and Setters

public int getCid() {
	return Cid;
}

public void setCid(int cid) {
	Cid = cid;
}

public String getCertName() {
	return certName;
}

public void setCertName(String certName) {
	this.certName = certName;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}


}
