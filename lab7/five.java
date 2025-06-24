// 5. WAP to find out largest number from given three numbers without using Logical Operator.(C)

import java.util.Scanner;
class five{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b) if(a>c) System.out.println("A is the biggest");
        else if(b>c) System.out.println("b is the biggest");
        else if(a==b) if (a>c) System.out.println("a and b are equal and c is smaller number");
        else System.out.println("C is the biggest");
    }
}
