import java.io.*;
import java.util.*;
public class FileHandleString
{
    public static void main(String args[])throws IOException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\FileExample_2.txt";
        FileWriter fw=new FileWriter(path+filename);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to write into file : ");  
        while(true)
        {
            String s=sc.nextLine();
            if(s.equals("exit"))
            {
                fw.close();
                break;
            }else{
                fw.write(s+"\n");
            }
        }
        System.out.println("\n\nRead from file : ");  
        FileReader fr=new FileReader(path+filename);
        //int c=fr.read();
        //System.out.println((char)c);
        BufferedReader br = new BufferedReader(fr);
        String line;
        //String line=br.readLine();
        while ((line = br.readLine()) != null) //while(line!=null)
        {
            System.out.println(line);
        }
        br.close();
    }
}