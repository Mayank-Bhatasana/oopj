import java.util.Scanner;

class Candidate{
  public static void main(String[] args) {
    Candidate_data c1 = new Candidate_data();
    clearScreen();
    c1.GetCandidateDetails();
    clearScreen();
    c1.DisplayCandidateDetails();
  }

  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }  
}

class Candidate_data{
  int candidate_id, candidate_age, candidate_Weight, candidate_Height;
  Scanner sc = new Scanner(System.in);
  String candidate_name ; 
  void GetCandidateDetails(){
    System.out.println("Give candidates id, age, weight, height and then name");
    candidate_id = sc.nextInt();
    candidate_age = sc.nextInt();
    candidate_Weight = sc.nextInt();
    candidate_Height = sc.nextInt();
    sc.nextLine();
    candidate_name =  sc.nextLine(); 
  }

  void DisplayCandidateDetails(){
    System.out.println("The candidate details are following ");
    System.out.println("Name : " + candidate_name);
    System.out.println("Id : " + candidate_id);
    System.out.println("Age: " + candidate_age);
    System.out.println("weight: " + candidate_Weight);
    System.out.println("height: " + candidate_Height);
  }
}


