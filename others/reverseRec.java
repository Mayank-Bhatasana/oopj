// reverse of number using recurstion
import java.util.Scanner;
class one{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int n = sc.nextInt();
        System.out.println(rev(n));
    }
    public static int rev(int n){
        if ( n <= 0)
            return 0;
        return (10 * rev(n/10)) + n % 10;
    }
}

/*
     temp = n % 10;
     rev = rev * 10  + temp
     n/=10
*/
/*
     45
     45/10
*/
