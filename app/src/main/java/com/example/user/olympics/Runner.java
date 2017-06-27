package com.example.user.olympics;

/**
 * Created by user on 27/06/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Boxer Colin = new Boxer(10, 5);
        Gymnast Jia = new Gymnast(10, 5);
        TextFileLog text = new TextFileLog();

//        Jia.event();
        Colin.event();

//        Jia.run(33);
//        Jia.run(5);
    }
}
