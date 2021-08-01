import javax.swing.*;
import java.awt.*;

public class Scroll extends JFrame
{
    Container c;
    JScrollPane j;
    JButton b[],d;
    public Scroll()
    {
        c = getContentPane();
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3,3));
        for(int i=1;i<=10;i++)
        {
            jp.add(new JButton("Button"+i));
        }
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        j = new JScrollPane(jp,v,h);
        c.add(j);
    }
    public static void main(String a[])
    {
        Scroll s = new Scroll();
        s.setSize(300,300);
        s.setVisible(true);
    }
}