import java.util.Scanner;
public class Numbers
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 1,000 to 999,999 (Please add a comma): ");
        String a = s.next();
        int index = a.indexOf(",");
 		String sub = a.substring(0,index);
 		String sub2 = a.substring(a.length()-3);
		String subs = sub + sub2; 
        System.out.println(subs);
    }
}

