import java.util.*;
public class Q2b {
    static boolean isprime(int n){
        int c=0;
        for(int i=2;i<n;i++){    
            if(n%i==0){
                c+=1;
            }
        }
        if(c==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String... s){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[30];
     for(int i=0;i<n;i++)
     {
         int x=sc.nextInt();
         arr[i]=x;
     }
     for(int i=0;i<n;i++){
         if(arr[i]%2!=0 && isprime(arr[i])){
             System.out.print(arr[i]);
         }
     }
     sc.close();
    }
}
