import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yBottom;
    private Random z;
    private int widthRand;
    private int heightRand;
    private int colorRand;
    private Color[] colorArray = {Color.BLACK, Color.GRAY, Color.GREEN};

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yBottom = y; 
        z = new Random();
        
        heightRand = z.nextInt(200)+200;
        colorRand = z.nextInt(3);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        
        
        Rectangle building = new Rectangle(xLeft, yBottom-heightRand, 90, heightRand);
        g2.setPaint(colorArray[colorRand]);
        g2.fill(building);
        
    }
}
