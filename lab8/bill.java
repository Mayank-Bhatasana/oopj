// WAP that prompts the user to input number of calls and calculate the monthly telephone bills as per
// the following rule: (B)
// Minimum Rs. 200 for up to 100 calls.
// Plus Rs. 0.60 per call for next 50 calls.
// Plus Rs. 0.50 per call for next 50 calls.
// Plus Rs. 0.40 per call for any call beyond 200 calls.

import java.util.Scanner;

class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of calls: ");
        int call = sc.nextInt();
        double amount = 200;
        if (call > 100 && call <= 150) {
            int callsInRange = call - 100;
            amount += callsInRange * 0.60;
        } else if (call > 150 && call <= 200) {
            amount += 50 * 0.60;
            int callsInRange = call - 150;
            amount += callsInRange * 0.50;
        } else if (call > 200) {
            amount += 50 * 0.60;
            amount += 50 * 0.50;
            int callsInRange = call - 200;
            amount += callsInRange * 0.40;
        }

        System.out.printf("The telephone bill is: Rs. %.2f\n", amount);
    }
}
