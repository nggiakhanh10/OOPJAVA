import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        String[] daysInWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so tu 1 den 7: ");
        int day = sc.nextInt();
        sc.close();
        System.out.println(daysInWeek[day-1]);
    }
}
