import java.util.*;
public class Q5c {
    public static void main(String... s){
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     String str1=sc.next();
     char arr[]=str.toCharArray();
     char arr1[]=str1.toCharArray();
     Arrays.sort(arr);
     Arrays.sort(arr1);
     String str2=new String(arr); 
     String str3=new String(arr1);
     if(str2.equals(str3))
     {
         System.out.print("Anargam");
     }
     else{
         System.out.print("Not an anagram");
     }
     sc.close(); 
    }
} 