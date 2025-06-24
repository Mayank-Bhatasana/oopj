
import java.util.Scanner;

class leapyear {

    public static void main(String[] args) {
        System.out.println("What year is it?");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print(year + " is a leap year");
        }
    }
}
