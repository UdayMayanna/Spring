package com.springcore.springlifecycle;

public class Laptop {
   private String laptopBrand;
   private int laptopRAM;
   private int laptopROM;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(String laptopBrand, int laptopRAM, int laptopROM) {
	super();
	this.laptopBrand = laptopBrand;
	this.laptopRAM = laptopRAM;
	this.laptopROM = laptopROM;
}
public String getLaptopBrand() {
	return laptopBrand;
}
public void setLaptopBrand(String laptopBrand) {
	this.laptopBrand = laptopBrand;
}
public int getLaptopRAM() {
	return laptopRAM;
}
public void setLaptopRAM(int laptopRAM) {
	this.laptopRAM = laptopRAM;
}
public int getLaptopROM() {
	return laptopROM;
}
public void setLaptopROM(int laptopROM) {
	this.laptopROM = laptopROM;
}
@Override
public String toString() {
	return "Laptop [laptopBrand=" + laptopBrand + ", laptopRAM=" + laptopRAM + ", laptopROM=" + laptopROM + "]";
} 

public void init() {
	System.out.println("Inside Init");
}

public void destroy() {
	System.out.println("Inside Destroy Method");
}
}
