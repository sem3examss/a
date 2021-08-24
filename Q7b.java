import java.util.*;
public class Q7b{
    public static void main(String... s1){
        Vector v = new Vector();
        byte b=5;  
        short s=25;  
        int i=300;  
        long l=40000;  
        float f=52.0F;  
        double d=70.8D;  
        char c='M';  
        boolean b2=true;  
        Byte byteobj=b;  
        Short shortobj=s;  
        Integer intobj=i;  
        Long longobj=l;  
        Float floatobj=f;  
        Double doubleobj=d;  
        Character charobj=c;  
        Boolean boolobj=b2;  
        v.add(byteobj);
        v.add(shortobj);
        v.add(intobj);
        v.add(longobj);
        v.add(floatobj);
        v.add(doubleobj);
        v.add(charobj);
        v.add(boolobj);
        System.out.println(v);
    }
}