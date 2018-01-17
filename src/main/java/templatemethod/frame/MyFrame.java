import javax.swing.*;
import java.awt.*;

/**
 * Created by Professional on 2018-01-17.
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "Message in paint method";
        g.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Design Patterns");
    }
}
