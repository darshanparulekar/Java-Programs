import java.util.Scanner;

public class bubble_sort
{
   public static void main(String args[])
   {
        int n, i, j, temp;
        int arr[] = new int[50];
       
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Enter Total Number of Elements : ");
        n = scan.nextInt();
                
        System.out.println("Enter " +n+ " Numbers : ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
                
        System.out.println("Sorting Array using Bubble Sort Technique...\n");
        for(i=0; i<(n-1); i++)
       {
            for(j=0; j<(n-1); j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
                
        System.out.println("Array Sorted Successfully..!!\n");
                
        System.out.println("Sorted List in Ascending Order : \n");
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]+ "  ");
        }
   }

}