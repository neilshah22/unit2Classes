import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Color;

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    /** description of instance variable x (add comment for each instance variable) */
    private int yTop;
    /**
     * Default constructor for objects of class BackGround
     */
    public Sky(int x1, int y1)
    {
        // initialise instance variables
        xLeft = x1;
        yTop = y1;
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
    public void draw(Graphics2D g2, String str)
    {
        // put your code here
        Rectangle sky = new Rectangle(xLeft, yTop, 1000, 1000);
        g2.draw(sky);
        if(str.equals("BLUE"))
        {
            g2.setColor(Color.BLUE);
        }
        else if(str.equals("BLACK"))
        {
            g2.setColor(Color.BLACK);
        }
        else if(str.equals("RED"))
        {
            g2.setColor(Color.RED);
        }
        else if(str.equals("YELLOW"))
        {
            g2.setColor(Color.YELLOW);
        }
        else if(str.equals("ORANGE"))
        {
            g2.setColor(Color.ORANGE);
        }
        else
        {
            g2.setColor(java.awt.Color.BLACK);
            System.out.println("Sorry I don't have that color");
        }
        g2.fill(sky);

    }
}
