import java.util.*;
import java.lang.*;
import java.io.*;
public class Q9a {
    public static void main(String ... s) throws IOException{
        File file1=new File("input.txt");
        FileInputStream fs=new FileInputStream(file1);
        InputStreamReader inp=new InputStreamReader(fs);
        BufferedReader br=new BufferedReader(inp);
        int data=inp.read();
        int cc=0;
        int nc=0;
        int tc=0,sc=0;
        while(data!=-1){
          char c=(char)data;
          if((c>='a' && c<='z')||(c>='A' && c<='Z')){
              cc++;
          }
          else if(c>='0' && c<='9'){
              nc++;
          }
          else if(c==' '||c=='\t' || c=='\n'){
              tc++;
              
          }
          else{
              sc++;
              //System.out.print(c+" ");
          }
        data=inp.read();
        }
        try{
        FileOutputStream obj=new FileOutputStream("output.txt");
        String str=String.format("char count %d   num count %d   ter count %d   special count  %d",cc,nc,tc,sc);
        byte[] bytearray=str.getBytes();
        obj.write(bytearray);
        }
        catch(IOException e){
            System.out.print("Error occured!");
        }
        System.out.printf("char count %d   num count %d   ter count %d   special count  %d",cc,nc,tc,sc);
    }
}