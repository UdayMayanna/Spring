package com.springcore.springlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bottle {
     private String bottleBrand;
     private int bottleCapacity;
     private  String bottleColor;
	public Bottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bottle(String bottleBrand, int bottleCapacity, String bottleColor) {
		super();
		this.bottleBrand = bottleBrand;
		this.bottleCapacity = bottleCapacity;
		this.bottleColor = bottleColor;
	}
	public String getBottleBrand() {
		return bottleBrand;
	}
	public void setBottleBrand(String bottleBrand) {
		this.bottleBrand = bottleBrand;
	}
	public int getBottleCapacity() {
		return bottleCapacity;
	}
	public void setBottleCapacity(int bottleCapacity) {
		this.bottleCapacity = bottleCapacity;
	}
	public String getBottleColor() {
		return bottleColor;
	}
	public void setBottleColor(String bottleColor) {
		this.bottleColor = bottleColor;
	}
	@Override
	public String toString() {
		return "Bottle [bottleBrand=" + bottleBrand + ", bottleCapacity=" + bottleCapacity + ", bottleColor="
				+ bottleColor + "]";
	}
	
	//Specifically need to add javax annotation depedency in pom.xml
	// available upto java 8 version
      
	@PostConstruct
	public void myinit() {
		System.out.println("called init method");
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("called destroy method");
	}
}
