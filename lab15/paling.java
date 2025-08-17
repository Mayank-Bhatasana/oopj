import java.util.Scanner;
class paling {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give any string");
    String str = sc.nextLine();
    String str2 = new StringBuilder(str).reverse().toString();
    System.out.println(str2);
    if(str.equals(str2))
      System.out.println("It's a palindrome number");
    else
      System.out.println("Not a palindrome");
  }
}
