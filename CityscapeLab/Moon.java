import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

import java.awt.Color;

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    
    /** description of instance variable y (add comment for each instance variable) */
    private int yTop;
    
  

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y; 
        
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
        // put your code here
        
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft, yTop, 80, 80);
        
        g2.draw(moon);
        g2.setColor(new Color(255,255,100));
        g2.fill(moon);
        
        
    }
}
