import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class frame4 extends Frame implements WindowListener {
    frame4() {
        setSize(500, 500);
        setVisible(true);
        addWindowListener(this);
    }

    public void windowOpened(WindowEvent e)
    {
        repaint();
    }
    public void windowClosed(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowActivated(WindowEvent e){}
    public void windowClosing(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void paint(Graphics g)
    {
        g.drawRect(50,50,100,100);
    }

    public static void main(String[] args) {
        new frame4();
    }
}
