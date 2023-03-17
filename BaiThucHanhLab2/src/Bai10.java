import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuoi muon nhap:");
        String str = sc.nextLine();
        if (str.length() > 80) {
            System.out.println("Qua 80 ki tu !");
        } else {
            System.out.println("Nhap ki tu ban muon dem so lan xuat hien trong chuoi");
            char c = sc.nextLine().charAt(0);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    frequency++;
                }
            }
            System.out.printf("So lan xuat hien ki tu %c trong chuoi %s la: %d",c,str,frequency);
        }
    }
}
