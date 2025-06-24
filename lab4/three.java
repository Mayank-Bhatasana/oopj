import java.util.Scanner;
class three{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area");
		int f = sc.nextInt();
		System.out.print((f - 32) * 5/9);
	}
}