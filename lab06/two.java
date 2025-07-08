//2. Perform Addition, Subtraction, Multiplication and Division of 2 numbers as per user’s choice. (A)

import java.util.Scanner;
class two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Give two numbers");
		float a = sc.nextFloat();
		float b = sc.nextFloat();

		System.out.println("Give the perform");
		char q = sc.next().charAt(0);
		
		System.out.println("Give the perform"+q);
		
		float ans=0;
		switch(q){
			case '+':
				ans = a+b;
				break;	

			case '-':
				ans=a-b;
				break;	

			case '*':
				ans= a*b;
				break;	

			case '/':
				ans= a/b;
				break;		
		};
		
		System.out.println("The ans for "+a+' '+q+' '+b+" = "+ans);

	}
}