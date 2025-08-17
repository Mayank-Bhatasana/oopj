import java.util.Scanner;

class Circle{
  static double PI = 3.14;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the radius"); 
    int r = sc.nextInt();
    System.out.println(area(r));
    System.out.println(perimeter(r));
  }


  static double area(double r){
    return PI * r * r;
  }

  static double perimeter(double r){
    return 2 * PI * r;
  }
}
