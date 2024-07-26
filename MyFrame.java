import java.awt.*;

public class MyFrame extends Frame
{
  Label l1,l2,l3;
TextField tf1,tf2,tf3;
Button b1,b2;

MyFrame()
{
   l1=new Label("Enter first Integer Number:");
   l2=new Label("Enter Second Integer NUmber:");
   l3=new Label("Result:");

   tf1=new TextField(20);
   tf2=new TextField(20);
   tf3=new TextField(20);
  
   b1=new Button("Add");
   b2=new Button("clear");

  

setTitle("Addtion window");
setSize(500,500);
setLayout(new FlowLayout());
}
public static void main(String args[])
{
   MyFrame f=new MyFrame();

System.out.println("Frame object is created");
}
}