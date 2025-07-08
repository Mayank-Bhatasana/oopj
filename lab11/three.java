// 3. WAP that calculates area of circle, triangle and square using method overloading. (A)

import java.util.Scanner;
class three{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give three variable");
        System.out.println("The circle area is "+ area(sc.nextInt()));
        System.out.println("The triangle area is "+ area(sc.nextInt(),sc.nextInt()));
        System.out.println("The square area is "+ area(sc.nextByte()));
    }
    static double area(int r){
        return ((r*r)*3.14);
    }
    static double area(int b,int h) {
        return 0.5 * b * h;
    }
    static double area(byte l){
        return  l * l;
    }
}

