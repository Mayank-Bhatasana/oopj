import java.util.Scanner;
class two{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give the value");
		int side = sc.nextInt();
		int l = sc.nextInt();
		int w = sc.nextInt();

		System.out.println("sqar's area is: " + (side*side) + " and perimeter is " + (4*side));
		System.out.println("rectangle's area is: " + (w*l) + " and perimeter is " + (2*(w*l)));
	}
}