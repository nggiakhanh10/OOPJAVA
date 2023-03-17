import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mang 2 chieu co kich co m x n");
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        double[][] arr = new double[m][n];
        double max = Double.MIN_VALUE;
        for (int i = 0; i < m;i++) {
            for (int j = 0; j < n;j++) {
                System.out.printf("Nhap gia tri cho phan tu thuoc hang %d cot %d: ",i + 1,j + 1);
                arr[i][j] = sc.nextDouble();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Phan tu co gia tri lon nhat trong ma tran 2 chieu la: " + max);
    }
}
