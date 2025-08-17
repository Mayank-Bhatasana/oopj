// 2. WAP to find factorial of the given number. (A)
import java.util.Scanner;
class two9{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a input");
        // get a number from user
        int n = sc.nextInt();
        int fact=1;

        // get the fact
        for(int i = 1; i<=n; i++)
            fact*=i;

        System.out.println("The factorial is "+fact);
    }
}
