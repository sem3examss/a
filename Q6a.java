import java.util.Scanner;
public class Q6a{
    public static void main(String... s){
      Scanner sc=new Scanner(System.in);
      String t=sc.next();
      String b=sc.next();
      int amount=sc.nextInt();
      Cost c=new Cost(t,b,amount);
      c.display();
      sc.close();
    }
}
class vehicle{
    String vehicle_type;
    vehicle(String v_t){
           vehicle_type=v_t;
    }
}
class Brand extends vehicle{
    String brand;
    Brand(String v_t,String b){
    super(v_t);
    brand=b;
    }
}
class Cost extends Brand{
    int c;
    Cost(String v_t,String b,int co){
        super(v_t,b);
        c=co;
    }
    public void display(){
        System.out.print(vehicle_type+" "+brand+" "+c);

    }
}