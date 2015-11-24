package com.github.kusl.java;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
//            int sleep_time = MyUtility.get_a_number_between_min_and_max(10, 100);
            System.out.println(i);
            try {
                java.lang.Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable person = new Person(i);
            new Thread(person).start();
        }
    }
}
