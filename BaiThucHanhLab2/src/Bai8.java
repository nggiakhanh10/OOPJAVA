import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong so nguyen duong can tinh trung binh la");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n;i++) {
           int k = sc.nextInt();
            sum += (double)(k);
        }
        double trungbinh = sum / n;
        System.out.println("Trung binh: " + trungbinh);
    }
}
