import java.awt.Graphics2D; 
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;

public class Building
{
    private int xLeft;
    private int yTop;
    private Random z;
    private int widthRand;
    private int heightRand;
    private int colorRand;
    private Color[] colorArray = { Color.BLACK, Color.RED, Color.GREEN };
    public Building(int x, int y)
    { 
        xLeft = x;
        yTop = y;
        z = new Random ();
        widthRand = z.nextInt(100);
        heightRand = z.nextInt(300);
        colorRand = z.nextInt(3);
    }

    public void draw(Graphics2D g2)
    {
        Rectangle Building = new Rectangle(xLeft, yTop, widthRand, heightRand);
        g2.setPaint(colorArray[colorRand]);
        g2.fill(Building);
    }
}
    