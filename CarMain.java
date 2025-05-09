package com.example;

public class CarMain {
public static void main(String args[]) {
	Car res=new Car();
	res.setCarDetailes("swift", "maruti", 600000.0);
	String s=res.getCarDetailes();
	System.out.println(s);
}
}
