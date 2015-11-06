package com.github.kusl.java;

public class HelloWorld {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			Sum sumObject = new Sum();
			// set values ourselves for now
			Thread thread = new Thread(new Summation(i, sumObject));
			thread.start();
			try {
                System.out.println(Thread.currentThread().getName());
                thread.join();
                System.out.println(sumObject.getSum());
            }
            catch (InterruptedException ie) {System.out.println(ie.getMessage());}
		}
	}
}
