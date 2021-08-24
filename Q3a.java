import java.util.*;
public class Q3a{
    public static void main(String... s){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n*n];
    for(int i=0;i<n*n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[(n+1)*i]+" ");
    }
    sc.close();
    }    
}