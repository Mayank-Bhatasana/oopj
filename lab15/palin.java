import java.util.Scanner;
class palin{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give any string");
    String str[] = sc.nextLine();
    if(str == str.reverse())
      System.out.println("It's a palindrome number");
    else
      System.out.println("Not a palindrome");
  }
}
