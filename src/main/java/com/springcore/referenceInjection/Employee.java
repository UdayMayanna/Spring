package com.springcore.referenceInjection;

public class Employee {
  private String employeeName;
  private String employeeAddress;
  private int employeeId;
  private BankDetails employeeBankDetails;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String employeeName, String employeeAddress, int employeeId, BankDetails employeeBankDetails) {
	super();
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeId = employeeId;
	this.employeeBankDetails = employeeBankDetails;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public BankDetails getEmployeeBankDetails() {
	return employeeBankDetails;
}
public void setEmployeeBankDetails(BankDetails employeeBankDetails) {
	this.employeeBankDetails = employeeBankDetails;
}
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + ", employeeId="
			+ employeeId + ", employeeBankDetails=" + employeeBankDetails + "]";
}
}
