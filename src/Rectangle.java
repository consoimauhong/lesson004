import java.awt.*;
import java.util.Scanner;
//tao lop rectangle,khai bao thuoc tinh (properties),dinh nghia pthuc khoi tao
public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // dinh nghia cac phuong thuc getArea(); getPerimeter(), dislay()
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}

