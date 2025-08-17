import java.util.Scanner;

class Time{
  public static void main(String[] args) {
    Time_Detail t1 = new Time_Detail();
    Time_Detail t2 = new Time_Detail();
    t1.getTime();
    t1.displayTime();
    t2.getTime();
    int sum = t1.m + t2.m;
    int sum2 = t1.h + t2.h;
    while(sum >=60){
      sum-=60;
      sum2++;
    }
  System.out.println(sum);
  System.out.println(sum2);
  }
}


class Time_Detail{
  int h, m;
  Time_Detail(t,m){
    h=t;
    m=m;
  }
  Scanner sc = new Scanner(System.in);
  void getTime(){
    System.out.println("Give hour and min");
    h = sc.nextInt();
    m = sc.nextInt();
  }

  void displayTime(){
    System.out.println(((h<10) ? "0"+h : h) + ":" + ((m<10) ? "0"+m : m));
  }
}
