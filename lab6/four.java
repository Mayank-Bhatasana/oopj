import java.util.Scanner;
class four{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give a time");
		int time =sc.nextInt();
		int hour = time/3600;
		int min = ((time-(hour*3600))/60);
		int sec = (((time-(hour*3600)))-(min*60));
		System.out.printf("%02d:%02d:%02d", hour, min, sec);
		// System.out.println("The sum is : "+hour+':'+((min < 10) ? '0'+min : ' ')+':'+sec);
	}
}