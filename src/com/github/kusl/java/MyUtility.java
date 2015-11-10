package com.github.kusl.java;

public class MyUtility {
    public static void sleep_randomly(int min, int max) {
        int sleep_time = MyUtility.get_a_number_between_min_and_max(min, max);
        System.out.println("We will now sleep for about " + sleep_time + " nano seconds.");
        try {
            java.lang.Thread.sleep(sleep_time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int get_a_number_between_min_and_max(int min, int max) {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}