import java.util.Scanner;
class four{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float pound = sc.nextFloat();
		float inches = sc.nextFloat();
		double kg = (pound/2.205); 
		double meter = inches/39.37;
		meter *= meter;
		double BMI = kg/meter;
		System.out.print(BMI);
	}
}