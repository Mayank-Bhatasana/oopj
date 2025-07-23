import java.util.Scanner;

class unique{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int uni[] = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            int flag=1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j])
                    flag=0;
            }
            if(flag == 1)
                sum+=arr[i];
        }
        for (int i = 0; i < max; i++) {
          System.out.println("SKDJFLSDKFJDLFKJDLj");
        }
      
        System.out.println(sum);
    } 
}
