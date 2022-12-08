import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.print("Nhap he so bac 2, a = ");
         a = scanner.nextDouble();
        System.out.print("Nhap so bac 1, b = ");
         b = scanner.nextDouble();
        System.out.print("Nhap hang so tu do, c = ");
        c = scanner.nextDouble();
        System.out.println("phuong triinh bac hai : " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
