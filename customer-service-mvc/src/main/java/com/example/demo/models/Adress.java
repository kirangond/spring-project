package com.example.demo.models;

public class Adress {
	
	private  String addressLine1;
	private  String addressLine2;
	private String city;
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Adress(String addressLine1, String addressLine2, String city) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Adress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + "]";
	}

	

}
