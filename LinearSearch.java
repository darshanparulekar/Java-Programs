import java.io.*;
import java.util.*;

public class LinearSearch
{
    public static void main(String args[])
    {
            int nums[]=new int[50];
            Scanner scan = new Scanner(System.in);
                
            System.out.println("Enter Total Number of Elements : ");
            int n = scan.nextInt();
                    
            System.out.println("Enter " +n+ " Numbers : ");
            for(int i=0; i<n; i++)
            {
                nums[i] = scan.nextInt();
            }

            int target;
            System.out.println("Enter target:");
            target = scan.nextInt();

            int ans= linearsearch(nums, target);
            System.out.println(ans);
    }

    static int linearsearch(int arr[], int target)
    {
            if(arr.length==0)
            {
                return -1;
            }

            for(int index=0; index < arr.length;index++)
            {
                int element = arr[index];
                if(element == target)
                {
                    System.out.println("Target found at : ");
                    return index;
                    //System.out.println("Target found at : "+index);
                }

            }
            System.out.println("Error finding the target");
            return (0);
            
    }
    
}
