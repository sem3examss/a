import java.util.Scanner;
public class Q2a {
    public static void main(String...s){
        Scanner sc=new Scanner(System.in);
        try
        {
        long n=sc.nextLong();
        if(n>Byte.MIN_VALUE && n<Byte.MAX_VALUE){
          System.out.print("this is byte "+(byte)n);
        }
        else if(n>Short.MIN_VALUE && n<Short.MAX_VALUE){
            System.out.print("this is short "+(short)n);
        }
        else if(n>Integer.MIN_VALUE && n<Integer.MAX_VALUE){
            System.out.print("this is int "+(int)n);
        } 
        else if(n>Long.MIN_VALUE && n<Long.MAX_VALUE){
            System.out.print("this is long "+n);
        } 
       }
       catch(Exception e){
           System.out.print("give int");
       }
        sc.close();
    }
}
