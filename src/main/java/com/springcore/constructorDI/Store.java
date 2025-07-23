package com.springcore.constructorDI;

import java.util.List;

public class Store {
    private int storeId;
    private String storeName;
    private String storeCity;
    private List<Customer> customer;
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(int storeId, String storeName, String storeCity, List<Customer> customer) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeCity = storeCity;
		this.customer = customer;
	}
	
	//---------------*****************--------------
	//Even though we will not require this setter and getter methods
	// as we are doing constructor I am including them as good practice
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreCity() {
		return storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeCity=" + storeCity + ",\n customer="
				+ customer + "]";
	}
	
}
