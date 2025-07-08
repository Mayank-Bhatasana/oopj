
import java.util.Scanner;

class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int temp = one;
        two = one;
        one = temp;

        System.out.println("a = " + one + " b = " + two);

    }
}
