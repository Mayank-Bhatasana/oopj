// 2. WAP to count number of even or odd number from an array of n number. (A)
import java.util.Scanner;
class one{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Give "+ size +" numbers");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        int even=0,odd=0;
        for(int i=0; i<size; i++)
            if (arr[i] % 2 == 0) even++;
            else odd++;

        System.out.printf("There are %d odd number and %d even numbers",odd,even);


    }
}

