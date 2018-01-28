import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by Professional on 2018-01-27.
 */
public class ProxyImage implements Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread downloadThread;
    boolean download = false;

    public ProxyImage(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if (!download) {
                download = true;

                downloadThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL,"CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                downloadThread.start();
            }

        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 800;
        }
    }
}
