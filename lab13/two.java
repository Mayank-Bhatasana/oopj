import java.util.Scanner;

class CricketScorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of batsmen: ");
        int numBatsmen = scanner.nextInt();
        scanner.nextLine();

        String[] headers = {"Batsman", "Runs", "Balls", "4s", "6s", "SR"};

        String[][] scorecard = new String[numBatsmen + 1][6]; 

        for (int i = 0; i < 6; i++) {
            scorecard[0][i] = headers[i];
        }

        for (int i = 1; i <= numBatsmen; i++) {
            System.out.println("\nEnter details for batsman " + i + ":");
            
            System.out.print("Name: ");
            scorecard[i][0] = scanner.nextLine();
            
            System.out.print("Runs: ");
            scorecard[i][1] = scanner.nextLine();
            
            System.out.print("Balls faced: ");
            scorecard[i][2] = scanner.nextLine();
            
            System.out.print("Number of 4s: ");
            scorecard[i][3] = scanner.nextLine();
            
            System.out.print("Number of 6s: ");
            scorecard[i][4] = scanner.nextLine();
            
            System.out.print("Strike Rate: ");
            scorecard[i][5] = scanner.nextLine();
        }

        System.out.println("\nCRICKET SCORECARD");
        System.out.println("==========================================");
        for (int  i=0; i<=numBatsmen; i++) {
            for (int j=0; j<6; j++)
                System.out.print(scorecard[i][j] + "\t");
            System.out.println();
        }
        System.out.println("==========================================");

        scanner.close();
    }
}

