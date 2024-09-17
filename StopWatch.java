import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class StopWatchThread extends Thread{
    JTextField jtf;
    StopWatchThread(JTextField jt){
        jtf = jt;
    }
    public void run(){
        while(true){            
            Date d = new Date();
            int hh = d.getHours();
            int mm = d.getMinutes();
            int ss = d.getSeconds();
            jtf.setText(""+hh+":"+mm+":"+ss);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
            }
        }
    }
}

class StopWatchFrame extends JFrame implements ActionListener{
    JTextField jtf;
    JButton jb1,jb2;
    StopWatchThread swt;

    StopWatchFrame(){
        setBounds(100,100,300,300);
        setLayout(new FlowLayout());

        jtf = new JTextField(20);
        add(jtf);

        jb1 = new JButton("START");
        jb1.addActionListener(this);
        add(jb1);

        jb2 = new JButton("STOP");
        jb2.setEnabled(false);
        jb2.addActionListener(this);
        add(jb2);

        swt = new StopWatchThread(jtf); //pass your textfield

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jb1){
            if(!swt.isAlive()){
                swt.start();
                jb1.setEnabled(false);
                jb2.setEnabled(true);
            }else{
                swt.resume();
                jb1.setEnabled(false);
                jb2.setEnabled(true);
            }
        }
        if(ae.getSource()==jb2){
            swt.suspend();
            jb2.setEnabled(false);
            jb1.setEnabled(true);
        }
    }
}

class TestStopWatchFrame{
    public static void main(String args[]){
        new StopWatchFrame();
    }
}