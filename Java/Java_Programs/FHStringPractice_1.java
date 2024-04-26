import java.io.*;
import java.util.*;
class FHStringPractice_1
{
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\FileHandle.txt";
        FileWriter fw=new FileWriter(path+filename);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str;
        while(true)
        {
            str=sc.next();
            if(str.equals("exit"))
            {
                fw.close();
                break;
            }else{
                fw.write(str+"\n");
            }
        }
        FileReader fr=new FileReader(path+filename);
        BufferedReader br=new BufferedReader(fr);
        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }
    }
}