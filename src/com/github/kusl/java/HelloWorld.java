package com.github.kusl.java;

import java.util.ArrayList;
import java.util.Random;

public class HelloWorld {
    public static final int minimum_candies_possible = 0;
    public static final int maximum_candies_possible = 100;
    public static ArrayList<Patient> patients;
    static int num_p, num_a, candy_threshold;

    static {
        patients = new ArrayList<>();
        for (int i = 0; i < num_p; i++) {
            patients.add(new Patient(randInt(minimum_candies_possible, maximum_candies_possible)));
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) {
        // we assume the arguments are passed in order of num_p, num_a, candy_threshold
        num_p = Integer.parseInt(args[0]);
        num_a = Integer.parseInt(args[1]);
        candy_threshold = Integer.parseInt(args[2]);
    }
}
