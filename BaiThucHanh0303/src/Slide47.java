import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so: ");
            int n = sc.nextInt();
            sum += n;
            res.append(n);
            if (sum <= 100) {
                res.append(" + ");
            } else {
                res.append(" = ");
            }
        } while (sum <= 100);
        sc.close();
        System.out.printf("%s%d",res.toString(),sum);
    }
}
