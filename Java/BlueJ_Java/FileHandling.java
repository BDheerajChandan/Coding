import java.io.*;

class FileHandling {
    public static void main(String args[]) throws IOException {
        // Creating a File object
        File file = new File("C:\\Users\\KIIT\\Desktop\\CDAC\\Java\\BlueJ_Java\\example.txt");

        // Checking if file exists
        boolean exists = file.exists();
        boolean created = file.createNewFile();
        System.out.println(exists+" , "+created);
    }
}
