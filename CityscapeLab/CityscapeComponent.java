import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // define the CityscapeComponent contructor and intiailize all instance variables
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void painComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        // invoke the draw method on each object in your Cityscape
        

        Cityscape cityscape1 = new Cityscape(0,0);  
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Cityscape cityscape2 = new Cityscape(x,y);
        cityscape1.draw(g2);
        cityscape2.draw(g2);
    	
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        
         
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
