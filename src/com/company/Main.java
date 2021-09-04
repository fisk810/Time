package com.company;

public class Main {

    public static void main(String[] args) {
        double hour = 14.0;
        double minute = 10.0;
        double second = 37.0;


        System.out.println(hour * 3600 + minute * 60 + second);

        System.out.println(((24 - hour) * 3600) + ((59 - minute) * 60) + (60-second));

        System.out.println("percentage of day that has passed: " + ((hour * 3600 + minute * 60 + second) / 86400 * 100) + "%");
    }
}
