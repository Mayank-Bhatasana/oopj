// 4. WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants. (B)

import java.util.Scanner;

class four{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Character");
        char letter = sc.next().charAt(0);
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("It's a vowel");
        }
        else System.out.println("It's a consonants");

    }
}
