import java.io.*;
import java.util.*;

class area
{
    int length, breadth;
    area(int a, int b)
    {
        length=a;
        breadth=b;
    }
    void area()
    {
        int total=(length*breadth);
        System.out.println("\nArea   : \t" +total);
    }
}
class volume extends area
{
    int height;
    volume(int a,int b, int c)
    {
        super(a, b);
        height = c;
    }
    void volume()
    {
        int vol = (length*breadth*height);
        System.out.println("Volume :\t" +vol);
    }
}
public class single_inhert
{
    public static void main(String args[])throws IOException
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Length :\t");
        int a = scan.nextInt();

        System.out.print("Enter Bredth :\t");
        int b = scan.nextInt();

        System.out.print("Enter Height :\t");
        int c = scan.nextInt();

        volume v1 = new volume(a, b, c);
        
        v1.area();
        v1.volume();
    }   
}
