import java.util.Scanner;

class Employee{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many employees?");
    int n = sc.nextInt();
    Employee_Detail[] e = new Employee_Detail[n];
    for (int i = 0; i < n; i++) {
      e[i] = new Employee_Detail();
      e[i].GetEmployeeDetails();
    }
    for (int i = 0; i < n; i++) {
      e[i].DisplayAccountDetails(); 
    }
  }
}

class Employee_Detail{
  int employee_id, age, salary;
  Scanner sc = new Scanner(System.in);
  String employee_name, Designation; 
  void GetEmployeeDetails(){
    System.out.println("Give the Employee's Name, Designation, id, age, salary"); 
    employee_name = sc.nextLine();

    Designation = sc.nextLine();

    employee_id = sc.nextInt();
    age = sc.nextInt();
    salary = sc.nextInt();
  }

  void DisplayAccountDetails(){
    System.out.println("The Users details are following ");
    System.out.println("Name : " + employee_name);
    System.out.println("Id : " + employee_id);
    System.out.println("Designation : " + Designation);
    System.out.println("Age : " + age);
    System.out.println("salary : " + salary);
  }
}


