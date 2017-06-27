package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public class ConsoleLog implements ActivityLog {
    private int distance_run;

    public ConsoleLog() {
        this.distance_run = 0;
    }

    public int getDistance() {
        return distance_run;
    }

    public void run(int distance) {
        this.distance_run += distance;
        System.out.println(String.format("You have ran %d miles! Your current distance is %d", distance, this.distance_run));
    }

    @Override
    public void run() {

    }
}

