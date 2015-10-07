import javax.swing.JFrame;

public class CityScapeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("City Scape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CityScapeComponent component = new CityScapeComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
