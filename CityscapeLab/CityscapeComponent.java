 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import javax.swing.JComponent;
 import java.util.Random;
 import java.lang.String;
 /**
  * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 @@ -11,15 +12,36 @@
  */
 public class CityscapeComponent extends JComponent
 {
    // define the objects in your Cityscape as instance variables
    // ...

    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    private Sky sky;
    private Moon moon;
    private Random z;
    private Building building1;
    private int x;
    private int y;
    private int x1;
    private int y1;
    
    /**
     * Descibe instance variables
     */
    public CityscapeComponent()
    {
        int x = getWidth();
        int y = getHeight();
        int x1 = 0;
        int y1 = 0;
        z = new Random();
        
        x1 = z.nextInt(200);
        y1 = z.nextInt(100);
        
        this.sky = new Sky(x, y);
        this.moon = new Moon(x1, y1);
        this.building1 = new Building(x, y);
        
    }

    //* This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
    //* It does not need to be invoked explicitly.
    public void paintComponent(Graphics g)
        // invoke the draw method on each object in your Cityscape
        // ...
    {    
       Graphics2D g2 = (Graphics2D) g; 
       Sky sky = new Sky(0,0);
       Building building1 = new Building(400, 300);
       Building building2 = new Building(500, 400);
       Building building3 = new Building(600, 500);
       Building building4 = new Building(300, 600);
       Building building5 = new Building(700, 200);
       Building building6 = new Building(500, 100);
       Moon moon = new Moon(0,0);
       sky.draw(g2,); 
       building1.draw(g2);
       building2.draw(g2);
       building3.draw(g2);
       building4.draw(g2);
       building5.draw(g2);
       building6.draw(g2);
       moon.draw(g2);
    }
    public void nextFrame()
    { 
    }
}
