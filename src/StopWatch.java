import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Time is " + now);


    }
    private long starTime;
    private long endTime;
    StopWatch(){
    };

    private long getStarTime(){
        return this.starTime;
    }

    private long getEndTime(){
        return this.endTime;
    }

    public void starTime(){
        System.out.println(java.time.LocalTime.now());
    }

    public void start(){
        this.starTime = new Date().getTime();
    }

    public void stop(){
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        return this.endTime - this.starTime;
    }
}