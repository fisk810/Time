package com.company;

public class Main {

    public static void main(String[] args) {
        double hour = 14.0;
        double minute = 10.0;
        double second = 37.0;

        int cHour = 14;
        int cMinute = 20;
        int cSecond = 54;


        //number of seconds since midnight
        System.out.println(hour * 3600 + minute * 60 + second);
        //number of seconds till midnight
        System.out.println(((24 - hour) * 3600) + ((59 - minute) * 60) + (60-second));
        //percentage of day that has passed
        System.out.println("percentage of day that has passed: " + ((hour * 3600 + minute * 60 + second) / 86400 * 100) + "%");
        //elapsed time since starting on the exercise in seconds
        System.out.println(((cHour - hour) * 3600) + ((cMinute - minute) * 60) + (cSecond - second));
    
        //TODO your code looks really clean :D UwU xD
    }
}
