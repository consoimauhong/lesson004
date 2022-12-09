import java.util.Scanner;

import java.util.Scanner;
public class Fanclass {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean isOn = false;
    double radius = 5;
    String color = "blue";
    public Fanclass(){

    }
    public Fanclass(int speed, boolean isOn, double radius, String color){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.isOn = isOn;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getStatus(){
        return this.isOn;
    }
    public  double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setSpeed(int sp){
        this.speed = sp;
    }
    public void setStatus(boolean st){
        this.isOn = st;
    }
    public  void setRadius( double ra){
        this.radius = ra;
    }
    public void setColor( String co){
        this.color = co;
    }
    public String toString(){
        if(isOn) {
            return "Information of your fan: color " + this.color + " , speed " + this.speed + " radius " + this.radius + " your fan is on";
        } else {
            return "Information of your fan: color " + this.color + " , speed " + this.speed + " radius " + this.radius + " your fan is off";
        }
    }
}