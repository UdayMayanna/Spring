package com.springcore.referenceInjection;

public class BankDetails {
   private int bankAccountNumber;
   private String bankName;
   private String branchname;
public BankDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public BankDetails(int bankAccountNumber, String bankName, String branchname) {
	super();
	this.bankAccountNumber = bankAccountNumber;
	this.bankName = bankName;
	this.branchname = branchname;
}
public int getBankAccountNumber() {
	return bankAccountNumber;
}
public void setBankAccountNumber(int bankAccountNumber) {
	this.bankAccountNumber = bankAccountNumber;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
@Override
public String toString() {
	return "BankDetails [bankAccountNumber=" + bankAccountNumber + ", bankName=" + bankName + ", branchname="
			+ branchname + "]";
}
}
