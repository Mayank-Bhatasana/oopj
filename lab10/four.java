import java.util.Scanner;
class four{
    public static void main(String[] s){
        int counter = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print((counter++)+ " ");
            System.out.println();
        }
    }
}
