package com.example;

public class BankAccount {
String accountHolder;
int accountNumber;
double balance;
public void setAccountDetailes(String holder,int accNum,double bal) {
	accountHolder=holder;
	 accountNumber=accNum;
	 balance=bal;
}
public String getAccountDetailes() {
	return "account holder:"+accountHolder+"\naccountNumber:"+accountNumber+"\n balance:"+balance;
}
}
