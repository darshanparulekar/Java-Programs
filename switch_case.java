import java.io.*;
import java.util.*;
class switch_case {
	public static void main(String[] args)
	{

		Scanner sc= new Scanner(System.in);

		System.out.print("\nEnter A - ");
		int a=sc.nextInt();

		System.out.print("\nEnter B - ");
		int b=sc.nextInt();

		int c;

		System.out.println("\n~~ Menu ~~\n1.Addition\n2.Multiplication\n3.Subtraction\n4.Division");

		System.out.print("\nEnter your choice - ");
		int d=sc.nextInt();

		switch(d)
		{

			case 1:{
			
				c=a+b;
				System.out.println("\nAddition - " +c);
				break;
			}

			case 2:{

				c=a*b;
				System.out.println("\nMultiplication - " +c);
				break;
			}

			case 3:{

				c=a-b;
				System.out.println("\nSubtraction - " +c);
				break;
			}

			case 4:{
				System.out.println("\nDivision - \n");
				c=a/b;
				int r=a%b;
				System.out.println("Quotient - " +c);
				System.out.println("Reminder - " +r);
				break;
			}

			default:{
				System.out.println("Wrong Choice");
				break;
			}
		}
		System.out.println("\n");
	}
}