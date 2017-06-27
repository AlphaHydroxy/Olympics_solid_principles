package com.example.user.olympics;
import android.os.Build;
import android.support.annotation.RequiresApi;
import java.io.PrintWriter;

/**
 * Created by user on 27/06/2017.
 */

public class TextFileLog implements ActivityLog {
    private int distance_run;

    public TextFileLog() {
        this.distance_run = 0;
    }

    public int getDistance(){
        return distance_run;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static void main(String[] args) throws Exception {
        String str = ("you have ran %d miles today!");
        try (PrintWriter out = new PrintWriter("runningLog.txt", "UTF-8")) {
            out.write(str);
        }
    }

    @Override
    public void run() {

    }
}
