//Adding and Subtraction of elements in vector 

import java.io.*;
import java.util.*;

class Vecto
{
    public static void main(String args[])throws IOException
    {
        int i,y;
        Vector v = new Vector();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter no. of elements to enter in vector - ");
        y=Integer.parseInt(br.readLine());

        for(i=0; i<=y-1; i++)
        {
            System.out.print("Enter elements in vector - ");
            String u = br.readLine();
            v.addElement(u);
        }
       
        int n=0;

        System.out.print("\nElements in Vector\n");
        for(i=0; i<v.size(); i++)
        {
            System.out.print("\nElements at "+i+" is "+v.elementAt(i));
        }

        System.out.print("\n\nEnter the position of element to be removed - ");
        n = Integer.parseInt(br.readLine());
        v.removeElementAt(n);

        System.out.print("\nThe following are the elements in the vector\n");
        for(i=0;i<v.size();i++)
        {
            System.out.print("\nElements at "+i+" is "+v.elementAt(i));
        }
        System.out.print("\n");


    }
}