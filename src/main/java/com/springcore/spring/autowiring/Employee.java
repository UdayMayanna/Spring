package com.springcore.spring.autowiring;

public class Employee {
   private int employeeId;
   private String employeeName;
   private Address emplyeeAddress;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String employeeName, Address emplyeeAddress) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.emplyeeAddress = emplyeeAddress;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Address getEmplyeeAddress() {
	return emplyeeAddress;
}
public void setEmplyeeAddress(Address emplyeeAddress) {
	this.emplyeeAddress = emplyeeAddress;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emplyeeAddress="
			+ emplyeeAddress + "]";
}

}
