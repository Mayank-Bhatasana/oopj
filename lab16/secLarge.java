import java.util.Arrays;
import java.util.Scanner;
class secLarge{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How big is the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Give numbers");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("The second big is " + arr[n-2]);
  }    
}
