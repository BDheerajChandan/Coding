import java.io.*;
import java.util.*;
public class FHStringPractice_2
{
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\FileHandle.txt";
        FileWriter fw=new FileWriter(path+filename);
        System.out.println("Enter the String : ");
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
                fw.write(s+"\n");
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