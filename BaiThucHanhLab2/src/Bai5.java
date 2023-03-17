import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int sum = 0;
        do {
            int n;
            n = sc.nextInt();
            result = result + Integer.toString(n);
            sum+= n;
            if (sum > 100) {
                result += " = ";
            } else {
                result += " + ";
            }
        } while (sum <= 100);
        System.out.print(result + Integer.toString(sum));
    }
}
