import java.util.Scanner;
public class Q3c {
    public static void main(String... s){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[][]=new int[n][n];
     int sum=0,sum1=0;
    
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++)
         {
             arr[i][j]=sc.nextInt();
         }
     }
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++) 
        {
            if(i==j){
                sum+=arr[i][j];
            }
            if(i+j==n-1){
                sum1+=arr[i][j];
            }
        }
    }
    System.out.print(Math.abs(sum-sum1));
    sc.close();

    }
}
