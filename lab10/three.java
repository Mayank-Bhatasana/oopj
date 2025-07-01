import java.util.Scanner;
class three{
    public static void main(String[] s){
        char ch = 'a';
        for(int i =1; i<=5; i++){
            for(int k=5-i; k>=1; k--) System.out.print(' ');
            if(i%2==1) for(int j = i; j>=1 ; j--) System.out.print(j);
            else  {
                for(int j = i; j>=1 ; j--) System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
