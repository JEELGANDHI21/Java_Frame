import java.awt.*;
import java.awt.event.*;

class frame1 extends Frame implements ActionListener {
    Label  l1 = new Label("Enter 1st Number : ");
    Label  l2 = new Label("Enter 2nd Number : ");
    Label  l3 = new Label("Result : ");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    Button b1 = new Button("ADD");
    Button b2 = new Button("SUB");
    Button b3 = new Button("MUL");
    Button b4 = new Button("DIV");
    String s1;
    frame1()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(5,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        s1 = e.getActionCommand();
        if(s1.equals("ADD"))
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(""+(a+b));
        }
        else if(s1.equals("SUB"))
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(""+(a-b));
        }
        else if(s1.equals("MUL"))
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(""+(a*b));
        }
        else if(s1.equals("DIV"))
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(""+(a/b));
        }
    }

    public static void main(String[] args) {
        new frame1();
    }
}

