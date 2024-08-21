import java.awt.*;
import java.event.*;
import java.swing .*;

public class RCR extends JFrame

{  
 public RCR()
{
        super("DRAW recatangle");
setSize(250,125);
show();
}
public void paint(Graphics g)
{
 g.setColor(Color.blue);
g.drawRoundRect(30,50,200,50,50,50);

}
public static void main(String args[])
{
    RCR app=new RCR();

    app.addWindowListener{
new WindowAdapter()
{
 public void windowClosing(WindowEvent e)
{
 System.exit(0);
}
}
);
}
}

class RCR 
