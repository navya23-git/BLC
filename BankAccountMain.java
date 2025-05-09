package com.example;

public class BankAccountMain {
public static void main(String args[]) {
	BankAccount b=new BankAccount();
	b.setAccountDetailes("Rahul", 123456, 5000.0);
	String res=b.getAccountDetailes();
	System.out.println(res);
}
}
