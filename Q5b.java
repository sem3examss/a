import java.util.*;
public class Q5b{
    public static void main(String ...s){ 
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String aos[]=new String[n];
     for(int i=0;i<n;i++)
     {
         aos[i]=sc.next();
     }
     for(String str:aos)
     {
        int v=0;
        int c=0;
      for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u' || ch=='A'||ch=='E' || ch=='I'||ch=='O' || ch=='U'){
               v++;
           }
           else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
           {
               c++;
           }
      }
      System.out.print("vowels "+v+"Consonants "+c+" for string   "+str+"\n");
    }
   sc.close();
    } 
} 