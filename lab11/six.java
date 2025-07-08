// WAP to accept a number and check whether the number is prime or not. Use method name check (int
// n). The method returns 1, if the number is prime otherwise, it returns 0.
import java.util.Scanner;
class three{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        System.out.println(prime(sc.nextInt()));
    }
    static int prime(int n){
        for(int i=2;i<n;i++)
            if(n%i==0)
                return 1;
        return 0;
    }
}
