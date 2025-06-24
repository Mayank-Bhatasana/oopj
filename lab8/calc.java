// 1. WAP to make a Simple Calculator using switch...case. (A)
import java.util.Scanner;
class two{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
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
            System.out.println("Do you want to continue (Y)es are (N)o");
            char ch = sc.next().charAt(0);
            if(ch == 'n' || ch == 'N') break;
            else continue;
        }
    }
}
