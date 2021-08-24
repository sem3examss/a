import java.util.*;
import java.io.*;
public class Q9c {
    public static void main(String ... s){
        File file=new File("input.txt");
        File file1=new File("Stopwords.txt");
        ArrayList<String> li= new ArrayList<String>();
        ArrayList<String> li1= new ArrayList<String>();
        String a="";
        try{
        Scanner inp=new Scanner(file1);
        while(inp.hasNext()){
            a=inp.next();
            li.add(a.toLowerCase());
        }}
        catch(Exception e){
            System.out.print("file not found");
        }
        try{
        Scanner oup=new Scanner(file);
        while(oup.hasNext()){
            a=oup.next().toLowerCase();
            if(li.contains(a) || (li1.contains(a))){
                continue;
            }
            else 
             li1.add(a);
        }
        Collections.sort(li1);
        System.out.print(li1);
    }
        catch(Exception e){
            System.out.print("file not found");}
    }
}