import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.event.*;
public class slider extends Applet implements ChangeListener{
    JSlider j1,j2,j3;
    JLabel l1,l2,l3;
    public void init(){
      j1=new JSlider(JSlider.HORIZONTAL,0,255,100);
      j2=new JSlider(JSlider.HORIZONTAL,0,255,100);
      j3=new JSlider(JSlider.HORIZONTAL,0,255,100);
      l1=new JLabel("Red");
      l1.setOpaque(true);
      l2=new JLabel("blue");
      l2.setOpaque(true);
      l3=new JLabel("green");
      l3.setOpaque(true);
      add(l1);   add(l2); add(l3);  add(j1);   add(j2); add(j3);
      setLayout(new FlowLayout());
      j1.addChangeListener(this);
      j2.addChangeListener(this);
      j3.addChangeListener(this);
      setBackground(new Color(j1.getValue(),j2.getValue(),j3.getValue()));
    }
    public void StateChanged(ChangeEvent e){
        setBackground(new Color(j1.getValue(),j2.getValue(),j3.getValue()));
    }
    
}
