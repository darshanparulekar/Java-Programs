import java.io.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class exception
{
	public static void main(String argu[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Password");
			String s1=br.readLine();
			String s2="abcd"; //Password
			int a= s1.compareTo(s2);
			if (a==0)
			throw new MyException("Password is Correct");
			else
			throw new MyException("Password is Incorrect");	
		}
		catch (MyException e)
		{
			System.out.println(e);
		}
		catch( IOException e)
		{}
	}
}
