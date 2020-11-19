package com.lti.demo;

public class Person {
	
	private String personName;
	private int personAge;
	private double personSalary;
	public Person(String personName, int personAge, double personSalary) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personSalary = personSalary;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public double getPersonSalary() {
		return personSalary;
	}
	public void setPersonSalary(double personSalary) {
		this.personSalary = personSalary;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personSalary=" + personSalary + "]";
	}
	

}
