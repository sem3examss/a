import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class leftright extends JApplet implements Runnable{
    String str="Manvitha";
    int x;
public void init(){
    Thread t1=new Thread();
    t1.start();
}
public void run(){
    
    while(true) 
    {
   try{
    x=50;
    for(;x<150;x+=10){
        repaint();
       Thread.sleep(1000);
    }
    for(;x>150;x-=10){
        repaint();
        Thread.sleep(1000);
    }
   }
   catch(Exception e){
       System.out.print(e);
   }
    }
}
public void paint(Graphics g){
    super.paint(g);
    g.drawString(str,x,100);
}
}