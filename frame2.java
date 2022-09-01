import java.awt.*;
import java.awt.event.*;

class frame2 extends Frame implements ActionListener
{
    Button b1 = new Button("SUBMIT");
    String s1;
    int i = 0;
    frame2()
    {
        setSize(1000,1000);
        setVisible(true);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent e)
    {

        if(i==(i%3))
        {
            setBackground(Color.red);
            i++;
        }
        else if(i+1==(i%3))
        {
            setBackground(Color.green);
            i++;

        }
        else
        {
            setBackground(Color.blue);
            i++;
        }

    }
    public static void main(String[] args)
    {
        new frame2();
    }
}