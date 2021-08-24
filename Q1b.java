/* public class Q1b { 
    public static void main(String... s){
    int h=Integer.parseInt(s[0]);
    int m=Integer.parseInt(s[1]);
    int sec=Integer.parseInt(s[2]);
    String ampm=s[3];
    if(ampm=="PM" || ampm=="pm" ||h!=12)
    {
        h+=12;
    }
    else if(ampm=="PM" || ampm=="pm" ||h==12){
        h=0;
    }
    System.out.print(h+" - "+m+" - "+sec);
    }
}  
*/
import java.util.Scanner;
public class Q1b { 
    public static void main(String... s){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int m=sc.nextInt();
    int sec=sc.nextInt();
    String ampm=sc.next();
    if(ampm.equals("PM") || ampm.equals("pm") && h!=12)
    {
        h+=12;
    }
    else if(ampm.equals("PM") || ampm.equals("pm") && h==12){
        h=0;
    }
    System.out.print(h+" - "+m+" - "+sec);
    sc.close();
    }
}  