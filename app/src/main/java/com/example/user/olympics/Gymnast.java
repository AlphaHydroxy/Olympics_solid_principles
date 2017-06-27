package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;

    public Gymnast(int difficulty, int execution) {
        this.difficulty = difficulty;
        this.execution = execution;
    }

    public String prepare() {
        return "Gymnast stretches";
    }

    public String compete() {
        return "Gymnast is competing in the under 10s";
    }

    public int calculatePoints() {
        return difficulty += execution;
    }
}
