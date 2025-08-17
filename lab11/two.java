// 2. WAP to find maximum number from given three numbers using method. (A)
import java.util.Scanner;
class two11{
    public static void main(String[] v){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give three variable");
        System.out.println((max(sc.nextInt(),sc.nextInt(),sc.nextInt())));
    }
    static double max(int p, int r, int n){
        return (p>r && p>n) ? p : (r>n) ? r : n;
    }
}
