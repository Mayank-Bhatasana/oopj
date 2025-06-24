// 3. Convert number of days into year, week & days. [e.g. 375 days = 1 year, 1 week and 3 days] (C)

import java.util.Scanner;
class three{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the days");
        int days = sc.nextInt();
        int year=0,week=0,day=0;
        if(days>365){
            year = days/365;
            days %= 365;
        }
        if(days>7){
            week = days/7;
            days %= 7;
        }

        if(days>0){
            day = days;
        }

        System.out.printf("The answer is %d year %d weeks and %d days",year,week,day);
    }
}
