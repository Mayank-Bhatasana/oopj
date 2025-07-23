import java.util.Scanner;
class evenLength{
  public static void main(String[] a) {
    System.out.println("Give me a string"); 
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String s[] = str.split(" "); 
    for (int i = 0; i < s.length; i++) {
      if(s[i].length()%2==0)
        System.out.println(s[i]);
    }
  }
}
