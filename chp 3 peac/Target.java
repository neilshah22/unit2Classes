import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Target
{
    private int xLeft;
    private int yTop;
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double layer1 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 15, 15);
        Ellipse2D.Double layer2 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double layer3 = new Ellipse2D.Double(xLeft + 10, yTop + 20, 5, 5);
        g2.draw(layer1);
        g2.draw(layer2);
        g2.draw(layer3);
        g2.fill(layer1);
        g2.fill(layer2);
        g2.fill(layer3);
    }
}
    