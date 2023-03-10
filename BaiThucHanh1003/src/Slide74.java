import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        // Khoi tao mang
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon nhap day gom bao nhieu so: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Nhap mang
        for (int i = 0; i < n; i++) {
            System.out.printf("Xin moi ban nhap so thu %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        // In ra cac so chan trong mang va tinh tong
        int sumOfEven = 0;
        System.out.println("Cac so chan co trong mang la:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
                sumOfEven += arr[i];
                if (i != n - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.printf("\nTong cac so chan co trong mang la: %d", sumOfEven);
    }
}
