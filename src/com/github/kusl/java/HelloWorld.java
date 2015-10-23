package com.github.kusl.java;

public class HelloWorld {
	public static void main(String[] args) {
		Sum sumObject = new Sum();
		// set values ourselves for now
		int upper = 5;
		Thread thread = new Thread(new Summation(upper, sumObject));
		thread.start();
		try {
			thread.join();
			System.out.println(sumObject.getSum());
		}
		catch (InterruptedException ie) {System.out.println(ie.getMessage());}
	}
}
