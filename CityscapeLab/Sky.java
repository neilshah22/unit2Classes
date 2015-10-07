import java.awt.BufferedImage;

public class Sky
{
    private BufferedImage img;
    
    public Sky()
    {
        
        String[] skyArray;
        
        skyArray = new String[5];
        
        skyArray[0] = "http://globe-views.com/dcim/dreams/sky/sky-04.jpg";
        
        skyArray[1] = "http://montco.happeningmag.com/wp-content/uploads/2013/08/night-sky-hd-wallpaper-2.jpg";
        
        skyArray[2] = "http://i.telegraph.co.uk/multimedia/archive/01204/Full_moon_1204649c.jpg";
        
        skyArray[3] = "http://provotips.com/wp-content/uploads/2015/03/15-outer-space-wallpaper.jpg";
        
        skyArray(4) = "http://1-ps.googleusercontent.com/xk/HJB7Y9xE-t-vEV2aS_jH234XvR/www.dailydawdle.com/images.dailydawdle.com/20-space-cat-funny-cat-photos-cats-in-space3.jpg.pagespeed.ce.pCbZRVWrwZFbqxznWsjP.jpg";
       
        img = skyArray[Scanner input];
        try 
        {
            URL url = new URL("http://globe-views.com/dcim/dreams/sky/sky-04.jpg");
            img = ImageIO.read(url);
        } catch (IOExaception e) {
        }
    