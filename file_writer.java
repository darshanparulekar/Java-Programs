import java.io.*;
public class file_writer
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));  
        FileWriter fileWriter = new FileWriter("D:\\note.txt");
        FileReader fr = new FileReader("D:\\note.txt"); 

        BufferedReader br = new BufferedReader(fr);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.print("\nEnter a String : \t");

        String st = in.readLine();
        printWriter.print(st);
        System.out.println("File Written Sucessfully");
        String s;
        printWriter.close();
        while((s = br.readLine())!=null)
        {
            System.out.println("File Content :\t"+s);
        }
        fr.close();
    
    }
}
