// WAP to accept n numbers in an array. Now, enter a number and search whether the number is
// present or not in the list of array elements by using linear search.

import java.util.Scanner;
class four12{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Give "+ size +" numbers");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Give a number to find");
        int find = sc.nextInt();
        int flag =0;
        for(int i=0; i<size; i++) if (arr[i] == find) flag = 1;
        System.out.println(flag==1?"It's in array": "It's not an array");
    }
}
