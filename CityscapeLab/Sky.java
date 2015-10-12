import java.lang.Object;
import java.awt.Image.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.net.URLStreamHandler;
import javax.imageio.*;
import java.applet.Applet;

public class Sky
{
    private BufferedImage img;
    
   public Sky()
    {
                                                   
        String[] anArray;
        
        anArray = new String[5];
        
        anArray[0] = "http://globe-views.com/dcim/dreams/sky/sky-04.jpg";
        
        anArray[1] = "http://montco.happeningmag.com/wp-content/uploads/2013/08/night-sky-hd-wallpaper-2.jpg";
        
        anArray[2] = "http://i.telegraph.co.uk/multimedia/archive/01204/Full_moon_1204649c.jpg";
        
        anArray[3] = "http://provotips.com/wp-content/uploads/2015/03/15-outer-space-wallpaper.jpg";
        
        anArray[4] = "http://1-ps.googleusercontent.com/xk/HJB7Y9xE-t-vEV2aS_jH234XvR/www.dailydawdle.com/images.dailydawdle.com/20-space-cat-funny-cat-photos-cats-in-space3.jpg.pagespeed.ce.pCbZRVWrwZFbqxznWsjP.jpg";
       
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A number (0-4): ");
		int imgVal = s.nextInt();
		
		Image img = null;
			try 
        {
         URL url = new URL(anArray[imgVal]);
			//URL url = new URL(getCodeBase(), "examples/strawberry.jpg");
            img = ImageIO.read(url);
        } catch (IOException e) {
			e.printStackTrace();
        }
	
    }
}