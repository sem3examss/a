import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class mouseclick extends MouseMotionAdapter{
    public static void main(String ...s){
        mouse_click m=new mouse_click();
    }
}
class mouse_click extends MouseAdapter{
    JFrame frame;
    mouse_click(){
        frame =new JFrame("lallaal");
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(this);  
    }
    public void mouseClicked(MouseEvent e){
        Graphics g=frame.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(),e.getY(),20,10);
    }
}