import java.util.Scanner;
class demoClass{
  public static void main(String[] s) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a string");
    String some = sc.nextLine();
    System.out.println("The lenght of the string is " + some.length() );
    System.out.println("The charAt: " + some.charAt(1));
    System.out.println("The concat: "+ some.concat(" kldsfj ldkjfdf "));
    System.out.println("Index of: "+ some.indexOf('a') );
    System.out.println("The eduals: "+ some.equals("mayank"));
    System.out.println("The valueOf: "+String.valueOf(some));
    System.out.println("The to String: " + some.toString());
    System.out.println("The to trim(): "+ " 342348324 klfjads ".trim());
    System.out.println("The substring()): "+ some.substring(3,5));
  }
}
