// 1. WAP to check whether the given number is positive or negative. (A)
import java.util.Scanner;

class one{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int a = sc.nextInt();
        if(a>0) System.out.println("A is positive");
        else System.out.println("A is negative");
    }
}
