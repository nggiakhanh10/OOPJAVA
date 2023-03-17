import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        // Khoi tao mang
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon nhap day gom bao nhieu so: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        // Nhap mang
        for (int i = 0; i < n; i++) {
            System.out.printf("Xin moi ban nhap so thu %d: ", i + 1);
            arr[i] = sc.nextDouble();
        }
        // In mang truoc khi sap xep
        System.out.println("Day so truoc khi duoc sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        // Sap xep mang
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    double tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        // In mang sau khi sap xep
        System.out.println("\nDay so truoc khi duoc sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }
}
