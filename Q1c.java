/*import java.util.Scanner;
public class Q1c {
    static int fib(int n){
     if(n<=0){
         return n;
     }
     else{
         return fib(n-1)+fib(n-2);
     }
    } 

    public static void main(String... s){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fib(i));
        }
        sc.close();
    }
}  
*/
public class Q1c {
    static int fib(int n){
     if(n<=0){
         return n;
     }
     else{
         return fib(n-1)+fib(n-2);
     }
    } 

    public static void main(String... s){
        int n=Integer.parseInt(s[0]);
        for(int i=0;i<n;i++){
            System.out.print(fib(i));
        }
    }
}  
