// WAP to accept n numbers in an array. Display the sum of all the numbers which are divisible by either
// 3 or 5. (B

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

        int sum=0;
        for(int i=0; i<size; i++) if (arr[i] % 3 == 0 && arr[i] % 5 == 0) sum+=arr[i];

        System.out.println("The sum is: "+sum);


    }
}
