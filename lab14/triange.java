import java.util.Scanner;
class triange{
    public static void main(String[] a){
        System.out.println("How many stage?");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++)
                System.out.print("*");
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
            for(int k=1;k<n-i;k++)
                System.out.print(" ");
            
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }   
}
