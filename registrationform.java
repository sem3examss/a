import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class registrationform {
    public static void main(String... s){
        Registration r=new Registration();
    } 
}
class Registration extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JRadioButton g1,g2;
    JButton b1,b2;
    JTextArea a;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JPanel j1,j2;
    GridBagConstraints gbc;
    ButtonGroup g1g2;
    public Registration(){
        setLayout(new GridBagLayout());
        gbc=new GridBagConstraints();

        l1=new JLabel("name");
        gbc.gridx=0;   gbc.gridy=1;
        add(l1,gbc);

        t1=new JTextField(20);
        gbc.gridx=1;   gbc.gridy=1;
        add(t1,gbc);


     
        l2=new JLabel("rollno");
        gbc.gridx=0;   gbc.gridy=2;
        add(l2,gbc);

        t2=new JTextField(20);
        gbc.gridx=1;   gbc.gridy=2;
        add(t2,gbc);



        l3=new JLabel("branch");
        gbc.gridx=0;   gbc.gridy=3;
        add(l3,gbc);

        t3=new JTextField(20);
        gbc.gridx=1;   gbc.gridy=3;
        add(t3,gbc);



        l4=new JLabel("sec");
        gbc.gridx=0;   gbc.gridy=4;
        add(l4,gbc);

        t4=new JTextField(20);
        gbc.gridx=1;   gbc.gridy=4;
        add(t4,gbc);

        l5=new JLabel("mobile");
        gbc.gridx=0;   gbc.gridy=5;
        add(l5,gbc);

        t5=new JTextField(20);
        gbc.gridx=1;   gbc.gridy=5;
        add(t5,gbc);


        l6=new JLabel("Gender");
        gbc.gridx=0;   gbc.gridy=7;
        add(l6,gbc);
   
        g1=new JRadioButton("Female");
        g2=new JRadioButton("male");
        g1g2=new ButtonGroup();
        g1g2.add(g1);     g1g2.add(g2);

        j1=new JPanel();   
        j1.add(g1);    j1.add(g2);
    
        gbc.gridx=1;    gbc.gridy=7; 
        add(j1,gbc);

      
        l7=new JLabel("Address");
        gbc.gridx=0;   gbc.gridy=8;
        add(l7,gbc);

        a=new JTextArea(10,20);
        gbc.gridx=1;   gbc.gridy=8;
        add(a,gbc);
   
        

        b1=new JButton("Submit");
        b2=new JButton("Clear");

        j2=new JPanel();
        j2.add(b1);    j2.add(b2);
    
        gbc.gridx=1;    gbc.gridy=9; 
        add(j2,gbc);
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        setSize(300,300);
        setTitle("manadhe idhantha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String name=t1.getText();
            String roll_no=t2.getText();
            String branch=t3.getText();
            String sec=t4.getText();
            String mobile=t5.getText();
            String address=a.getText();
            int k=0;
            if(name.equals("")){
                k++;
                JOptionPane.showMessageDialog(null,"name ivvu");
            }
            if(roll_no.equals("")){
                k++;
                JOptionPane.showMessageDialog(null,"rollno ivvu");
            }
            if(branch.equals("")){
                k++;
                JOptionPane.showMessageDialog(null,"branch ivvu");
            }
            if(sec.equals("")){
                k++;
                JOptionPane.showMessageDialog(null,"sec ivvu");
            }
            if(mobile.equals("")){
                k++;
                JOptionPane.showMessageDialog(null,"mobile ivvu");
            }
            if(address.equals("")){
                k++;
                JOptionPane.showMessageDialog(null,"address ivvu");
            }
            if(!g1.isSelected() && !g2.isSelected()){
                k++;
                JOptionPane.showMessageDialog(null,"edhokati ivvu");
            }
         if(k==0){
            JOptionPane.showMessageDialog(null,"lopalaki pora");
         }
         if(ae.getSource()==b2){
             t1.setText(null);
             t2.setText(null);
             t3.setText(null);
             t4.setText(null);
             t5.setText(null);
             a.setText(null);
             g1g2.clearSelection();
         }
        }
    }  
}  
