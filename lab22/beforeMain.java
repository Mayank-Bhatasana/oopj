import java.util.Scanner;
class beforemain{
  public static void main(String[] args) {
    System.out.println("main method");
    some();
  }

  static{
    System.out.println("Static block");
  }

  static void some(){
    System.out.println("Static method");
  }
}
