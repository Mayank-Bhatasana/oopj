// 1. WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3. (A)
import java.util.Scanner;
class one{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a input");
        // get input from the user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++)
            if((i%2==0)&&(i%3!=0))
                System.out.println(i);
    }
}
