import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[])throws IOException
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        String s=input.readLine();
        int start=Integer.parseInt(input.readLine());
        int end=Integer.parseInt(input.readLine());
        String st="";
        int flag=0;
        char c='*';
        for(int i=0;i<s.length();i++)
        {
            if(c>='a' && c<='z' && c>='A' && c<='Z')
            {
                flag=1;
                break;   
            }
        }
        if(flag==1 && 1<=s.length() && s.length()<=100 && 0<=start && start<=end && end<=s.length())
        {
            //String st=s.substring(start,end);
            for(int i=start;i<=end;i++)
            {
                st=st+s.charAt(i);
            }
        }
        System.out.println(st);
    }
}