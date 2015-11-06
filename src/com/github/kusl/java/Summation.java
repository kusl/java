package com.github.kusl.java;

public class Summation implements Runnable {
    private int upper;
    private Sum sumValue;
    public Summation(int upper, Sum sumValue){
        if (upper < 99999999) {
            this.upper = upper;
            this.sumValue = sumValue;
        }
        else {
            throw new UnsupportedOperationException();
        }
    }
    public void run(){
        int sum = 0;
        for (int i = 0; i <= upper; i++){
            sum += i;
        }
        sumValue.setSum(sum);
    }
}
