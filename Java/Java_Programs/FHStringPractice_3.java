import java.io.*;
import java.util.*;
public class FHStringPractice_3
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\FileHandle.txt";
        FileWriter fw=new FileWriter(path+filename);
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String s;
        while(true)
        {
            s=sc.next();
            if(s.equals("exit"))
            {
                fw.close();
                break;
            }else{
                fw.write(s);
            }
        }
        FileReader fr=new FileReader(path+filename);
        BufferedReader br=new BufferedReader(fr);
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
    }
}
