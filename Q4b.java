
public class Q4b{
    public static void main(String... s){
    calculator c=new calculator();
    calculator c1=new calculator();
    System.out.println(c.powerInt(2,3));
    System.out.println(c1.powerDouble(23.4,4.3));
    System.out.println(c.count);
    }
} 

class calculator{
    static int count=0;
    public calculator(){
        count+=1;
    }
    static int powerInt(int x,int y){
        return (int)Math.pow(x,y);
    }
    static double powerDouble(double x,double y){
        return Math.pow(x,y);
    }
}
