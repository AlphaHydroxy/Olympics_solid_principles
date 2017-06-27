package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public class Boxer extends Athlete {

    private int hits_given;
    private int hits_taken;

    public Boxer(int hits_given, int hits_taken){
        this.hits_given = hits_given;
        this.hits_taken = hits_taken;
    }

    public String prepare() {
        return "Does a bit of shadow boxing!";
    }

    public String compete() {
        return "I'm gonna bash you!";
    }

    public int calculatePoints() {
        return hits_given += hits_taken;
    }

}
