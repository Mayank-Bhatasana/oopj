//WAP that reads a number in meters, converts it to feet, and displays the result

import java.util.Scanner;
class one{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give meter");
		float meters = sc.nextFloat();
		System.out.println("The feet is :"+(meters*3.281));
	}
}