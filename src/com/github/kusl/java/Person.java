package com.github.kusl.java;

public class Person implements Runnable {
    public static long time = System.currentTimeMillis();
    public int id;

    public Person() {

    }

    public Person(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        java.lang.Thread.currentThread().setName(this.getClass() + "-" + id);
        this.msg("started");
    }

    public void msg(String m) {
        System.out.println("[" + (System.currentTimeMillis() - time) + "] "
                + java.lang.Thread.currentThread().getName() + ": " + m);
    }
}