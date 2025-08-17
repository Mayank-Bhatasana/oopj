import java.util.Scanner;
class one13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What are the row and cols?");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.print("Give the numebr");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = sc.nextInt();
        

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
