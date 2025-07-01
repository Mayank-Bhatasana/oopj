import java.util.Scanner;
class one{
    public static void main(String[] s){
        for(int i =1; i<=5; i++){
            for(int k=5-i; k>=1; k--) System.out.print(' ');
            for(int j = i; j>=1 ; j--) System.out.printf("* ");
            System.out.println();
        }
    }
}
