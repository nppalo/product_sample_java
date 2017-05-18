package demoinsurance.auto.entity;

import insurance.product.model.entity.InsuredEntity;

public class Driver extends InsuredEntity {

	private String firstName = null;
	private String lastName = null;
	private int age = 0;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
