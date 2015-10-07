import java.util.Scanner;
public class Numbers
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        double a;
        System.out.print("Enter a number between 1,000 and 999,999: ");
        a = s.nextDouble();
        
        double num = a;
        System.out.print(a);
    }
}
