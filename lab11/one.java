// 1. WAP to calculate simple interest using method. (A)
import java.util.Scanner;
class one11{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give three variable");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((interest(p,r,n)));
    }
    static double interest(int p, int r, int n){
        return ((p*r*n)/100);
    }
}
