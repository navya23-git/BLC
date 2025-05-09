package com.example;

public class ProductMain {
public static void main(String args[]) {
	Product product=new Product();
	product.setProductDetailes("laptop", 501, 75000.0);
	String result=product.getProductDetailes();
	System.out.println(result);
}
}
