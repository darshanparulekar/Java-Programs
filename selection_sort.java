import java.util.*;
import java.io.*;
class selection_sort
{
    public static void main(String args[])throws IOException
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

        System.out.println("Sorting Array using Selection Sort Technique...\n");
        // One by one move boundary of unsorted subarray
		for (i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

        System.out.println("Array Sorted Successfully..!!\n");
                
        System.out.println("Sorted List in Ascending Order : \n");
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]+ "  ");
        }

    }
}
