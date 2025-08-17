import java.util.Scanner;
class mathFun{
  public static void main(String[] args) {
    System.out.println("How many number?");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter numbers:-  ");
    int max=0,min=n;
    int a[] = new int [n];
    double b[] = new double[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = Math.random() * 100;
      max = Math.max(max, a[i]);
      min = Math.min(min, a[i]);
    }

    System.out.println("The max number from the given array is " +max + " and the minmum number is "+min);
    System.out.println("Here is a random number" + Math.random() * 100);
    

    for (int i = 0; i < n; i++) {
      System.out.println("the number is " + b[i] + " the ceil is " + Math.ceil(b[i]) + " the floor is " + Math.floor(b[i]) + " the sqrt is " +Math.sqrt(b[i]) + " the round is " + Math.round(b[i]) + " the abs value is " + Math.abs(b[i]) +  " the pow is " + Math.pow(b[i], a[i]));
    }

  }
}
