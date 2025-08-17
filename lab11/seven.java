// WAP to find the factorial of given number using recursion
import java.util.Scanner;
class seven11{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int n;
        while(true){
            n = sc.nextInt();
            if (n<=0)
                System.out.println("Give a valid input");
            else
                break;
        }
        System.out.println(fact(n));
    }
    static int fact(int n){
        if (n==1) return 1;
        return n * fact(n-1);
    }

}
