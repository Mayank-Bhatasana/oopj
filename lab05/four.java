import java.util.Scanner;
class two{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give the value Principal, Interest rate,Compounding frequency and Time");
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double n = sc.nextDouble();
		double t = sc.nextDouble();

		System.out.println("The compound interes is :"+p*Math.pow((1+(r/n)),(n*t)));
	}
}