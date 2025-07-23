package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
   private String employeeName;
   private String employeeCity;
   private List<String> employeePhones;
   private Set<String> employeeAddresses;
   private Map<Integer, String> employeeCourses;
   private Properties properties;
public Employees() {
	super();
	// TODO Auto-generated constructor stub
}
public Employees(String employeeName, String employeeCity, List<String> employeePhones, Set<String> employeeAddresses,
		Map<Integer, String> employeeCourses,Properties properties) {
	super();
	this.employeeName = employeeName;
	this.employeeCity = employeeCity;
	this.employeePhones = employeePhones;
	this.employeeAddresses = employeeAddresses;
	this.employeeCourses = employeeCourses;
	this.properties = properties;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeCity() {
	return employeeCity;
}
public void setEmployeeCity(String employeeCity) {
	this.employeeCity = employeeCity;
}
public List<String> getEmployeePhones() {
	return employeePhones;
}
public void setEmployeePhones(List<String> employeePhones) {
	this.employeePhones = employeePhones;
}
public Set<String> getEmployeeAddresses() {
	return employeeAddresses;
}
public void setEmployeeAddresses(Set<String> employeeAddresses) {
	this.employeeAddresses = employeeAddresses;
}
public Map<Integer, String> getEmployeeCourses() {
	return employeeCourses;
}
public void setEmployeeCourses(Map<Integer, String> employeeCourses) {
	this.employeeCourses = employeeCourses;
}
public Properties getEmployeeprProperties() {
	return properties;
}
public void setProperties(Properties properties) {
	this.properties = properties;
}
@Override
public String toString() {
	return "Employees [employeeName=" + employeeName + ", employeeCity=" + employeeCity + ", employeePhones="
			+ employeePhones + ", employeeAddresses=" + employeeAddresses + ", employeeCourses=" + employeeCourses
			+ ", Properties=" + properties + "]";
}
}
