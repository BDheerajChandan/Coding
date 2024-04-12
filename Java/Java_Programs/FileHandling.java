import java.io.*;
class FileHandling
{
    public static void main(String args[]) throws IOException 
    {
        // Creating a File object
        File file = new File("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\Coding\\Java\\Java_Programs\\FileExample.txt");
        boolean exists = file.exists();// Checking if file exists
        System.out.println("File Exists ? - "+exists);
        boolean created = file.createNewFile(); // Creating new file
        System.out.println("File Created ? - "+created);
        System.out.println("File Exists ? - "+exists);
        boolean deleted = file.delete();
        System.out.println("File Deleted ? - "+deleted);
    }
}
