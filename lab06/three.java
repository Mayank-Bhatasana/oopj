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
		System.out.println("The sum is :"+sum+"and the percentage is "+(sum/5));
	}
}