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

//public class Rectangle{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nhap chieu rong: ");
//        double width = scanner.nextDouble();
//        System.out.print("nhap chieu cao: ");
//        double height = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your Rectangle \n" + rectangle.display());
//        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: " + rectangle.getArea());
//
//    }
//}
