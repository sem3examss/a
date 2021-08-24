import java.util.*;
public class Q8c {
    public static void main(String... s){
        HashMap<Integer,Employee> h=new HashMap<Integer,Employee>();
        Employee e1=new Employee(1,"manvi","google");
        Employee e2=new Employee(2,"manvi1","google1");
        Employee e3=new Employee(3,"manvi2","google2");
        h.put(e1.id,e1);   h.put(e2.id,e2);     h.put(e3.id,e3);
        int i=Integer.parseInt(s[0]); 
        if(h.containsKey(i)){
           Employee e= h.get(i);
           System.out.print(e.name +" "+e.company);
        }
        else{
            System.out.print("not found");
        }
    }
}
class Employee{
    int id;
    String name,company;
    Employee(int i,String n,String c){
      id=i;
      name=n;
      company=c;
    }
}