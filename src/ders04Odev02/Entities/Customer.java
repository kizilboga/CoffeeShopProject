package ders04Odev02.Entities;

import java.util.Date;

public class Customer {
private int customerId;
private String firstName;
private String lastName;
private String nationalId;
private Date dob;

public Customer() {
	
}

public Customer(int customerId, String firstName, String lastName, String nationalId, Date dob) {
	super();
	this.customerId = customerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nationalId = nationalId;
	this.dob = dob;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
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

public String getNationalId() {
	return nationalId;
}

public void setNationalId(String nationalId) {
	this.nationalId = nationalId;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

}
