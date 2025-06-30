// 3. WAP to find whether the given number is prime or not without using function. (B)
import java.util.Scanner;
class three{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a input");
        int n = sc.nextInt(), flag=0;
        for(int i = 2; i < n; i++)
            if(n%i==0)
                flag=1;

        if(flag==0) System.out.println("The number is prime");
        else System.out.println("The number is not prime");
    }
}
