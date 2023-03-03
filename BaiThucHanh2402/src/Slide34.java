import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();
        if (a == 0) {
            System.out.print("Nghiem cua phuong trinh la: " + (-c / b));
        } else {
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.print("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co 1 nghiem duy nhat: " + (-b / 2*a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.print("Nghiem x1: " + x1);
                System.out.print("Nghiem x2: " + x2);
            }
        }

    }
}
