import java.util.*;
import java.io.*;
class insertion_sort
{
    public static void main(String args[])throws IOException
    {
        int n, i, j, temp;
        int arr[] = new int[50];

        Scanner scan = new Scanner(System.in);
                
        System.out.println("Enter Total Number of Elements : ");
        n = scan.nextInt();
        
        //take "n" number of input from user
        System.out.println("Enter " +n+ " Numbers : ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Sorting Array using Insertion Sort Technique...\n");
        //sort numbers
		for (i = 1; i < n; ++i) {
			int key = arr[i];
			j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
        
        //display the sorted list
        System.out.println("Sorted List in Ascending Order : \n");
        for (i = 0; i < n; ++i)
        {
            System.out.println(arr[i]+ "  ");
        }
    }
}