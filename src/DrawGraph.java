import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class DrawGraph extends JComponent {
  float x,y;
    public DrawGraph(float x, float y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //ellipse
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(2f));
        g2.draw(new Ellipse2D.Double(150, 150, x, y));
        //X Axis
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(Color.BLACK);
        g2.draw(new Line2D.Double(0, 270, 600, 270));
        //Y Axis
        g2.setStroke(new BasicStroke(2f));
        g2.setColor(Color.BLACK);
        g2.draw(new Line2D.Double(270, 0, 270, 600));

        }


    }




