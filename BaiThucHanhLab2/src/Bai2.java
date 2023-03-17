import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap vao 1 so nguyen");
        a = sc.nextInt();
        if (a % 2 ==0) {
            System.out.printf("So %d la so chan", a);
        } else {
            System.out.printf("So %d la so le", a);
        }
    }
}
