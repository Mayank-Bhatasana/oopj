// 4. WAP to print given number in reverse order. (C)
import java.util.Scanner;
class four9{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a input");
        int n = sc.nextInt(),rev=0;

        while(n!=0){
            int temp=n%10;
            n/=10;
            rev = rev * 10 + temp;
        }
        System.out.println("The output is "+rev);
    }
}
