package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

abstract class Athlete {

    public void event(){
        prepare();
        compete();
        awardMedal();
    }

    public abstract String prepare();
    public abstract String compete();
    public abstract int calculatePoints();

    public String awardMedal() {
        int score = calculatePoints();
        String medal = null;
        if (score >= 15) {medal = "Gold";}
        else if (score < 15 && score >= 10) {medal = "Silver";}
        else if (score <= 9 && score >= 5) {medal = "Bronze";}
        return medal;
    }



}
