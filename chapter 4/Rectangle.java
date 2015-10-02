import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner one = new Scanner(System.in); 
        double a, b;
        
        System .out.print("Enter Hight of rectangle: ");
        a = one.nextDouble();
        
        System.out.print("Enter the length of the rectangle: ");
        b = one.nextDouble();
        
        //**Area**\\
        double area = a*b;
        System.out.println("The Area of the Rectangle is: " + area);
        
        //**Perimeter**\\
        double per = a+b;
        System.out.println("The Perimeter of the Rectangle is :" + per);
        
        //**Lenght of the diameter**\\
        double lod = Math.pow(a,2) + Math.pow(b,2);
        double lod2 = Math.pow(lod,.5);
        System.out.println("The lenght of the diameter is :" + lod2);
    }
}

        