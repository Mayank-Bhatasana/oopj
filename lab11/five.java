// 4. Write a method with following method header: public int gcd (int num1, int num2). Write a program
// that prompts the user to enter two integers and compute the gcd of two integers. [Note: The

import java.util.Scanner;
class five11{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give two number ");
        System.out.println(max(sc.nextInt(),sc.nextInt()));
    }
    static int max(int a,int b){
        int temp=0;
        for(int i=2; i<= ((a>b) ? a : b); i++)
            if ((a % i == 0) && (b % i == 0))
                temp = i;
        return temp;
    }
}

