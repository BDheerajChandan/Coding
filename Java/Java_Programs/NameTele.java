import java.io.*;
class NameTele{
    public void data() throws IOException{
        String name[] = {"Ritiek","Pratiek","Yashwin","Ketan","Vikas"};
        int telephone[] ={2630083, 2232198, 2211308, 2211311, 2282636};
        boolean value = false;
        System.out.println("Enter Name You want to Search");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        for(int i=0; i<5; i++){
            if(a.compareTo(name[i]) == 0){
                value = true;
                System.out.println("Search Successful!");
                System.out.println("Name is::" +name[i]);
            }
        }
        if(value == false){
            System.out.println("Search Unsuccessful.  Name not enlisted");
            data();
        }
    }
}

