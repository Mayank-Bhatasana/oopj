
import java.util.Scanner;

class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        one = one+two;
        two = one-two;
	one = one-two;

        System.out.println("a = " + one + " and b = " + two);

    }
}
