import java.util.Scanner;

class maxMin{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
            
        System.out.println("The max number is "+max(arr, n)+" and the min number is " + min(arr, n));
        
    }
    public static int max(int arr[],int n){
        int max=0;
        for(int i=0; i<n; i++)
            if(arr[i] > max)
               max=arr[i];
        
        return max;
    }
    
    public static int min(int arr[],int n){
        int min=arr[0];
        for(int i=0; i<n; i++)
            if(arr[i] < min)
               min=arr[i];
        
        return min;
    }
}
