package com.capg.lab2;

public class Person1 {
	
	private String fname,lname,phone;
	private char gender;
	
	public Person1() {
		
		System.out.println("Default Constructor is called");	
	}
	
    public Person1(String fname, String lname, char gender,String phone) {
		
    	this.fname=fname;
    	this.lname=lname;
    	this.gender=gender;
    	this.phone=phone;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person Details: \n First name: " + fname + "\n Last Name: " + lname + "\n Gender: " + gender+ "\n Phone number: "+ phone;
	}
	
	
	public void displayDetails(Object c)
	{
		System.out.println(c);
	}

}
