import java.util.Calendar;
import java.util.Scanner;

public class Bai3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int year;
        System.out.println("Nhap ten cua ban");
        name = sc.nextLine();
        System.out.println("Nhap nam sinh cua ban");
        year = sc.nextInt();
        Calendar instance = Calendar.getInstance();
        int curYear = instance.get(Calendar.YEAR);
        int age = curYear - year;
        if (age < 16) {
            System.out.printf("Ban %s o do tuoi vi thanh nien", name);
        } else if (age < 18) {
            System.out.printf("Ban %s o do tuoi truong thanh", name);
        } else {
            System.out.printf("Ban %s da gia", name);
        }
    }
}
