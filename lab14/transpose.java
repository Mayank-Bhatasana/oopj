import java.util.Scanner;

class transpose{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows and cols?");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = sc.nextInt();
                
        transpose(arr,r,c);
    }
    
    
    public static void transpose(int arr[][], int r, int c){
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++)
                System.out.print(arr[j][i] + " ");
            System.out.println();
        }
    }
}
