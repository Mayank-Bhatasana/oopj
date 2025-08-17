import java.util.Scanner;

class Rectangle{
  public static void main(String[] args) {
    Rectangle_class r1 = new Rectangle_class();
    Rectangle_class r2 = new Rectangle_class(100, 200);
    Rectangle_class r3 = new Rectangle_class(r2);

    System.out.println(r1.count);
  }
}

class Rectangle_class{
    
  static double length, width;
  static int count = 0;
  
  Rectangle_class(){
    length = 10.0;
    width = 20.0;
    count++;
    this.display();
  }

  Rectangle_class(double length, double width){
    this.length = length;
    this.width = width;
    count++;
    this.display();
  }

  Rectangle_class(Rectangle_class r){
    this.length = r.length;
    this.width = r.width;
    count++;
    this.display();
  }

  void display(){
    System.out.println("Answer = "+ this.length * this.width);
  }

}
