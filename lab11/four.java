// 3. WAP to generate Fibonacci series of N given number using method. (B)
import java.util.Scanner;
class four11{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number for a fibbo");
        fibbo(sc.nextInt());
    }
    static void fibbo(int fib){
        int a=0,b=1,c=1;
        for(int i=0; i<=fib; i++)
        {
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}

