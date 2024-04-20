/*
 * Java file handling is done under package named java.io
 * We need 'File' keyword for and need to create an object for it.
 * FIleHandling methods - canRead() : To check file is readable or not,
 *                  canWrite() : To check file is writable or not,
 *                  createNewFile() : Creates new empty file, 
                    delete() : Deletes a file,
                    exists() : To check existance of a file, 
                    getname() : To get/return name of file, 
                    getAbsoulutePath() : To get abs path of a file,
                    length() : To get/return size of a file,
                    list() : To get/return array of files in directory,
                    mkdir() : To create a new directory
   */




import java.io.*;
import java.util.*;
class FileHandling
{   
    public static void main(String args[]) throws IOException 
    {
        String filename="FileExample.txt";
        String path="C:\\Users\\KIIT\\Desktop\\Java\\";
        
        File file = new File(path+filename);  // Creating a File object
        System.out.println("***********************************");
        
        /*System.out.println("Before creating a file");
        boolean exists = file.exists();                     // Checking if file exists
        System.out.println("File Exists ? - "+exists);
        
        boolean created = file.createNewFile();           // Creating new file
        System.out.println("\nCreating a file");
        if (created==true)
        {
            System.out.println("File created?? - "+created);    // to check file created or not 
        }else{
            System.out.println("File Already created ;"+"File Exists ? - "+exists);    // to check file created or not 
        }
        
        boolean readable=file.canRead();
        System.out.println("\nFile is readable?? - "+readable);
        boolean writable=file.canWrite();
        System.out.println("File is writable?? - "+writable);
        String FileName=file.getName();
        System.out.println("\nFile Name : "+FileName);
        String FilePath=file.getAbsolutePath();
        System.out.println("File Path : "+FilePath);
        Long FileSize=file.length();
        System.out.println("File Size : "+FileSize);
        String files[]=file.list();
        int c=0;
        for(String i:files)
        {
            System.out.println("File "+c+" : "+i);
            c++;
        }
        String folderName=new String("FileExample");
        File folderPath=new File(path+folderName);
        boolean fileMakedir=folderPath.mkdir();
        System.out.println("Directory created? - : "+fileMakedir);*/
        
        //////////////////////////////////////////////////////////////////////////////
        FileWriter writer=new FileWriter(file,true);
        try
        {
            writer.append("Hi I am Dheeraj\n");
            writer.write("Hi I am Chandan\n");
            writer.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
        // TO read file
        try
        {
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String data=sc.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }    
    }
}
 
