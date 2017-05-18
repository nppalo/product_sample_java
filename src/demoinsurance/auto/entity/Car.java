package demoinsurance.auto.entity;

import insurance.product.model.entity.ObjectOfInsurance;

public class Car extends ObjectOfInsurance {

	String make = null;
	String model = null;
	Integer year = null;
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
}
