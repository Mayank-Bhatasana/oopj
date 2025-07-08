// 3. Find Sum of Digits of a Number. (C)

import java.util.Scanner;
class digit{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int num = sc.nextInt();

        int sum=0;

        for(;num!=0;num/=10){
            sum+=num%10;
        }
        System.out.println("The answer is "+sum);
    }
}
