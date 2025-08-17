// . WAP that create an array, take the size of array from the user, take the array member from the user
// and display it using loop
import java.util.Scanner;
class one12{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Give "+ size +" numbers");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Given "+ size +" numbers are: ");
        for(int i=0; i<size; i++)
            System.out.println(arr[i]);
    }
}
