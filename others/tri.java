
import java.util.Scanner;
class tri{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Give a input");
        // int n = sc.nextInt(),rev=0;
        int n=10;
        for(int i=1;i<=n;i++){
            for(int space = 0; space<=n-i;space++){
                System.out.print(" ");
            }

            for(int j =1; j<= (2 * i -1); j++){
                if(i == n) System.out.print("*");
                else if(j==1 || j == (2 * i -1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
