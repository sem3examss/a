package report;
import pack1.*;
import pack2.*;
public class Q7a {
public static void main(String ...s){
 Some sc=new Some();
 sc.info();
 student sp=new student();
 System.out.print(sp.name+" "+sp.roll_no);
 }
}
class Some implements sport{
public void info(){
    System.out.print("right handed");
    System.out.print("batsmen");
}
}