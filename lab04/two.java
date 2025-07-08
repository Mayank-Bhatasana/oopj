import java.util.Scanner;
class two{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area");
		int area = sc.nextInt();
		System.out.print(2*(Math.sqrt((area/3.14))));
	}
}