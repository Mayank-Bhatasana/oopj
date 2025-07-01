import java.util.Scanner;
class one{
    public static void main(String[] s){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1 || i==5){
                for(int j=1; j<=6;j++)
                    System.out.print("*");
            }
            else{
                for(int j=1; j<=6;j++)
                    if(j==1||j==6) System.out.print("*");
                    else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
