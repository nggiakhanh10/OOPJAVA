import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tong = 0;
        while (n > 0) {
            int i = n % 10;
            tong += i;
            n /= 10;
        }
        System.out.print("Tong cac chu so trong n: " + tong);
    }
}
