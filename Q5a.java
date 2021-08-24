import java.util.*;
public class Q5a{ 
    public static void main(String...s){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String part;
     int d=sc.nextInt();
      if(str.length()%d!=0){
       System.out.print("Can't divide");
      }
      else{
     String aos[]=new String[str.length()/d];
     int j=0;
     for(int i=0;i<str.length();i+=d){
       part=str.substring(i,i+d);
       aos[j]=part;
       j++;
     }
     Arrays.sort(aos);
     for(int i=0;i<str.length()/d;i++)
     {
         System.out.print(aos[i]+" ");
     }
    }
    sc.close();
    }
}