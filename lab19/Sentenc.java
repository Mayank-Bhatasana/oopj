import  java.util.Scanner;


class Sentenc{
  public static void main(String[] args) {
    wordCount w1 = new wordCount();
    System.out.println("Enter any word");
    w1.countVowel();
  }
} 


class wordCount{
  static int a,e,i,o,u;
  static Scanner sc = new Scanner(System.in);
  void countVowel(){
    outerloop:
    while(true){
      String words  = sc.nextLine();
      words = words.toLowerCase();

      String[] wordArr  = words.split(" ");

      for (String word : wordArr) {

        for (int j = 0; j < word.length(); j++) {
          if(word.equals("quit")){
            break outerloop;
          }

          switch (word.charAt(j)) {
            case 'a'-> a++; 
            case 'e'-> e++;
            case 'i' -> i++;
            case 'o'-> o++;
            case 'u'->  u++;
          }
        }
      }
    }
    System.out.printf("Number of vowels are following \na=%d \ne=%d \ni=%d \no=%d \nu=%d",a,e,i,o,u);
  }
}


