package com.springcore.spring.autowiring;

public class Address {
	private String addressCity;
	private String addressState;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressCity, String addressState) {
		super();
		this.addressCity = addressCity;
		this.addressState = addressState;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	@Override
	public String toString() {
		return "Address [addressCity=" + addressCity + ", addressState=" + addressState + "]";
	}
	
}
