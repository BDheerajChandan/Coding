import java.io.*;
class Insert {
    public static void main(String args[]) throws IOException {
        int limit[] = new int [51];
        int total,number;
        int location,previous,i;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter number of elements::");
        String n= input.readLine();
        total=Integer.parseInt(n);
        for(i=0;i<total;i++) {
            System.out.println("Enter number ::" +(i+1)+" ");
            n=input.readLine();
            limit[i]=Integer.parseInt(n);
        }
        System.out.println("Enter the location where the element to be inserted::");
        String s=input.readLine();
        location=Integer.parseInt(s);
        System.out.println("Enter the value to be inserted::");
        s= input.readLine();
        number=Integer.parseInt(s);
        if(location<=total){
            previous=total;
            while(previous>=location){
                limit[previous]=limit[previous-1];
                previous=previous-1;
            }
            limit[previous]=number;
            total=total+1;
            System.out.println("New Output is::");
            for(i=0;i<total;i++)
            System.out.println(limit[i]);
        }
        else
        System.out.println("Location out of Range:: Try Again");
    }
}











