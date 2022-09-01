import java.awt.*;
import java.awt.event.*;

class frame3 extends Frame implements ActionListener
{
    Button b1 = new Button("Red");
    Button b2 = new Button("Blue");
    Button b3 = new Button("Green");
    String s1;
    Canvas c1 = new Canvas();
    frame3()
    {
        setSize(1000,1000);
        setVisible(true);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(c1);
        c1.setSize(100,100);
    }
    public void actionPerformed(ActionEvent e)
    {
        s1=e.getActionCommand();
        if(s1.equals("Red"))
        {
            c1.setBackground(Color.red);
        }
        else if(s1.equals("Green"))
        {
            c1.setBackground(Color.green);
        }
        else if(s1.equals("Blue"))
        {
            c1.setBackground(Color.blue);
        }
    }
    public static void main(String[] args)
    {
        new frame3();
    }
}