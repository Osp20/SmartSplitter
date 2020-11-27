import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class module extends JFrame implements ActionListener 
{
String t11,t22;
JLabel usr,pass,msg,jl1,jl2,username,li;
JPasswordField t1;
Font f,f1;
Container c = getContentPane();
JButton login,cancel;
int p;
public static int cnt=0;
public static JProgressBar Processing=new JProgressBar();
private javax.swing.Timer timer;
public module()
{
setTitle("!!! Login Authentication !!!");
setSize(430,310);
setResizable(false);
setFocusable(false);
setForeground(Color.white);
setLayout(null);
f=new Font("Monotype Corsiva",Font.BOLD,17);
f1=new Font("Monotype Corsiva",Font.BOLD,15);
ImageIcon ij;
li=new JLabel(ij=new ImageIcon("images/tushar1.jpg"));
add(li);
li.setBounds(10,10,70,70);
jl2=new JLabel("***Smart Splitter & Merger***");

jl2.setFont(f);
usr=new JLabel("User Name :");
pass=new JLabel("Password  :");
msg=new JLabel("        Enter Password");
msg.setFont(f1);
username=new JLabel("Smart User");
username.setFont(f1);
t1=new JPasswordField();
jl2.setForeground(new Color(255,0,102));
usr.setForeground(new Color(255,0,102));
pass.setForeground(new Color(255,0,102));
t1.setForeground(new Color(255,0,102));
t1.setEchoChar('*');
msg.setForeground(new Color(255,0,102));
username.setForeground(new Color(255,0,102));
login=new JButton("Login");
cancel=new JButton("Cancel");
login.addActionListener(this);
cancel.addActionListener(this);
add(jl2);
add(usr);
add(pass);
add(username);
add(t1);
add(msg);
add(login);
add(cancel);
jl2.setBounds(85,30,300,25);
usr.setBounds(90,90,111,25);
pass.setBounds(90,140,111,25);
username.setBounds(220,90,150,25);
t1.setBounds(220,140,111,25);
msg.setBounds(100,200,260,25);
login.setBounds(50,245,100,25);
cancel.setBounds(280,245,100,25);
addWindowListener(new WindowAdapter () 
{ 
public void windowClosing (WindowEvent e) 
{ 
System.exit(0); 
} 
} 
);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==login)
{
t22=t1.getText();
++cnt;
if(cnt>3)
{
setVisible(false);
JOptionPane.showMessageDialog(c,"@@@@ Sorry !!! @@@ \nYou have only 3 login chnaces\nPlease Press * OK * Button \nTo Terminate Your Program\n@@@@ Thank You @@@@");
System.exit(0);
}
else
if(t22.equals("smartosp"))
{
setVisible(false);
EasySplitter m=new EasySplitter();
m.setSize(600,510);
m.setLocation(225,150);
m.show();
} 
else
{
t1.setText("");
msg.setText("Invalid Login");
}
}
if(ae.getSource()==cancel)
{
System.exit(0);
}
}
public static void main(String args[])
{
module md = new module() ;
md.setLocation(230,160);
md.show();
}
}
