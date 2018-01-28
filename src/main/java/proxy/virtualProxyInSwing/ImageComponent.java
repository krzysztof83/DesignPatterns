import javax.swing.*;
import java.awt.*;

/**
 * Created by Professional on 2018-01-27.
 */
public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon){
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w)/2;
        int y = (800 - w)/2;
        icon.paintIcon(this, graphics, x, y);
    }
}
