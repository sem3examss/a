import java.util.*;
public class Q8a {
    public static void main(String ... s){
      int x1,y1;
      Scanner sc=new Scanner(System.in);
      x1=sc.nextInt();    y1=sc.nextInt();
      Random r=new Random();
      for(int i=0;i<10;i++){
          System.out.print(r.nextInt((y1-x1)+1)+x1+"\n");
      }

      sc.close();
    } 
}