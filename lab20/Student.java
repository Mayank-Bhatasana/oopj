/*Write a class program with following specifications: (A)
Class Name: Student
Data Members: Enrollment_No, Student_Name, Semester, CPI and SP*/

class Student{
  public static void main(String[] args) {
    Student_Data sd1 = new Student_Data("Mayank", 101, 3, 9.19, 32);
    sd1.display();
  }    
}

class Student_Data{
  static int eno, sem;
  static double cpi, sp;
  static String Student_Name = "";
  Student_Data(String Student_name,int eno, int sem,  double cpi,double sp){
    this.Student_Name = Student_name;
    this.eno = eno;
    this.sem = sem;
    this.cpi = cpi;
    this.sp = sp;
  }

  void display(){
    System.out.println("The details are " + eno + " " + cpi + " " + sem + " " + sp + " " + Student_Name);
  }
}


