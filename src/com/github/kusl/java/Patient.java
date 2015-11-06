package com.github.kusl.java;

public class Patient implements Runnable {
    private static int candy_threshold;
    private int number_of_candy;
    private boolean has_tummy_ache;

    public Patient() {
        number_of_candy = 0;
        has_tummy_ache = false;
    }

    public Patient(int number_of_candy) {
        this.number_of_candy = number_of_candy;
        has_tummy_ache = this.number_of_candy > candy_threshold;
    }

    public static int get_candy_threshold() {
        return candy_threshold;
    }

    public static void set_candy_threshold(int input_candy_threshold) {
        candy_threshold = input_candy_threshold;
    }

    public int get_number_of_candy() {
        return number_of_candy;
    }

    public void set_number_of_candy(int number_of_candy) {
        this.number_of_candy = number_of_candy;
        set_has_tummy_ache();
    }

    public void set_has_tummy_ache() {
        has_tummy_ache = this.number_of_candy >= candy_threshold;
    }

    @Override
    public void run() {

    }
}
