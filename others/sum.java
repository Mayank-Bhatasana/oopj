import java.util.Scanner;
class sum{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number");
		int num = sc.nextInt();
		int sum=0;
		while(num!=0){
			num--;
			sum++;
		}
		System.out.println("The sum is :"+sum);
	}
}