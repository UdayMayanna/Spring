package com.springcore.springlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Mobile implements InitializingBean,DisposableBean{
    private String mobileBrand;
    private int mobileRAM;
    private int mobileROM;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String mobileBrand, int mobileRAM, int mobileROM) {
		super();
		this.mobileBrand = mobileBrand;
		this.mobileRAM = mobileRAM;
		this.mobileROM = mobileROM;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public int getMobileRAM() {
		return mobileRAM;
	}
	public void setMobileRAM(int mobileRAM) {
		this.mobileRAM = mobileRAM;
	}
	public int getMobileROM() {
		return mobileROM;
	}
	public void setMobileROM(int mobileROM) {
		this.mobileROM = mobileROM;
	}
	@Override
	public String toString() {
		return "Mobile [mobileBrand=" + mobileBrand + ", mobileRAM=" + mobileRAM + ", mobileROM=" + mobileROM + "]";
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Method Called after Intializing The Property");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Method Called before destory");
	}
       
	
}
