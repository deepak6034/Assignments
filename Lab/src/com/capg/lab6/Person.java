package com.capg.lab6;

public class Person {

	private String fname,lname;
	private char gender;
	
	public Person() {
		
		System.out.println("Default Constructor");	
	}
	
    public Person(String fname, String lname, char gender) {
		
    	this.fname=fname;
    	this.lname=lname;
    	this.gender=gender;
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
	@Override
	public String toString() {
		return "Person Details: \n First name: " + fname + "\n Last Name: " + lname + "\n Gender: " + gender;
	}
	
	
	
}
