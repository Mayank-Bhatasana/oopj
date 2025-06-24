// 2. Modify program number 2 of Lab number 6. Calculate grade of a student depending on percentage. (If
// >90% then A+ grade, 80-90% then A grade, 70-80% then B+ grade, 60-70% then B grade, 50-60% then
// C grade, 35-50% then P grade and <35 then FT) (A)

import java.util.Scanner;
class three{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number");
		int num = 5;
		int sum=0;
		while(num!=0){
			int newNum = sc.nextInt();
			sum += newNum;
			num--;
		}
        int per = sum/5;
        System.out.println(sum);

        if(per>90) System.out.println("A+");
        else if (per > 80) System.out.println("A");
        else if (per > 70) System.out.println("B+");
        else if (per > 60) System.out.println("B");
        else if (per > 50) System.out.println("C");
        else if (per > 35) System.out.println("P");
        else System.out.println("Fail");
    }
}
