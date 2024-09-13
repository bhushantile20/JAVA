import java.awt.*;
import java.awt.event.*;
import java.swing.*;
class BlinkingImage extends JFrame implements Runnable
{
  JLable imageLabel;
 Thread t;
 boolean flag;

  public BlinkingImage()
{
  setSize(600,400);
setLocationRelativeTo(null);
setTitle("NSA Academy");

ImageIcon icon=new ImageIcon("nsgacademy.jpeg");
imageLabel=new JLabel(icon);
add(imageLabel,BorderLayout.CENTER);

t=new Thread(this);
t.start();

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

public void run()
{
while(true){

try{
flag= !flag;
imageLabel.setVisible(flag);
Thread.sleep(100);
}
catch(InterruptedException ie)
{
 System.out.println(ie);
}
}
}
public static void main(String[] args)
{
    new BlinkingImage();

}
}

