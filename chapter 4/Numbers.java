import java.util.Scanner;
public class Numbers
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 1,000 to 999,999 (Please add a comma): ");
        String a = s.next();
        int index = a.indexOf(",");
        System.out.println(a);
    }
}
