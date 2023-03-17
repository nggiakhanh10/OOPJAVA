import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        int i = 2;
        do {
            result *= i;
            i++;
        } while (i <= n);
        System.out.println(result);
    }
}
