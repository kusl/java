package com.github.kusl.java;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            int sleep_time = MyUtility.get_a_number_between_min_and_max(10, 100);
            System.out.println("We will now sleep for about " + sleep_time + " nano seconds.");
            try {
                java.lang.Thread.sleep(sleep_time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable contestant = new Person(i);
            new Thread(contestant).start();
        }
    }
}
