import java.util.Scanner;

class Bank{
  public static void main(String[] args) {
    Bank_Account b1 = new Bank_Account();
    b1.GetAccountDetails();
    b1.DisplayAccountDetails();
  }
}

class Bank_Account{
  int account_no, account_balance;
  Scanner sc = new Scanner(System.in);
  String user_name, email, account_type ; 
  void GetAccountDetails(){
    System.out.println("Give the user's name, email, account type, account no, then the balance"); 
    user_name = sc.nextLine();

    email = sc.nextLine();

    account_type = sc.nextLine();

    account_no = sc.nextInt();
    account_balance = sc.nextInt();
  }

  void DisplayAccountDetails(){
    System.out.println("The Users details are following ");
    System.out.println("Name : " + user_name);
    System.out.println("Account no : " + account_no);
    System.out.println("Email : " + email);
    System.out.println("Account type: " + account_type);
    System.out.println("Balance : " + account_balance);
  }
}


