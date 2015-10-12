import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.net.URLStreamHandler;
import javax.imageio.*;
import java.applet.Applet;
import java.awt.Image;


/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
	public static int imgVal;

   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
 		Sky sky = new Sky();
				
		Image img = null;
		try 
        {
         URL url = new URL( "http://i.telegraph.co.uk/multimedia/archive/01204/Full_moon_1204649c.jpg");
			//URL url = new URL(getCodeBase(), "examples/strawberry.jpg");
            img = ImageIO.read(url);
        } catch (IOException e) {
			e.printStackTrace();
        }
				
        // a frame contains a single component; create the Cityscape component and add it to the frame
        //CityscapeComponent component = new CityscapeComponent();
		JLabel label = new JLabel( new ImageIcon(img));
        frame.add(label);
       // frame.add(component);
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
//         for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
//         {
//             component.nextFrame();
//             Thread.sleep( 1000 );
//         }
    }
}

