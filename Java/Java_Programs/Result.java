import java.io.*;
class Result {
    public static void main (String args[]) throws IOException {
        int roll[] = new int [50];
        int sub1[] = new int [50];
        int sub2[] = new int [50];
        int sub3[] = new int [50];
        int total[] = new int[50];
        double average[]=new double[50];
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        for(int i=0;i<=4;i++){
            System.out.println("Enter Roll No. of the Student");
            String rn=input.readLine();
            roll[i]=Integer.parseInt(rn);
            System.out.println("Enter Marks in Subject A");
            String a=input.readLine();
            sub1[i]=Integer.parseInt(a);
            System.out.println("Enter Marks in Subject B");
            String b=input.readLine();
            sub2[i]=Integer.parseInt(b);
            System.out.println("Enter Marks in Subject C");
            String c=input.readLine();
            sub3[i]=Integer.parseInt(c);    
            total[i]=sub1[i]+sub2[i]+sub3[i];
            average[i]=(double)total[i]/3; 
        }
        System.out.println(" R E S U L T ");
        System.out.println("Roll No.    Subject A   Subject B   Subject C   Average");
        System.out.println("-------     ---------   ---------   ---------   -------");
        for(int k=0;k<=4;k++){
            int n;
            n=k+1;
            System.out.println(n  +"             "+sub1[k] +"            "+sub2[k] + "           "+sub3[k] + "          " +average[k]);
        }
        int max=total[0];
        int high1=sub1[0];
        int high2=sub2[0];
        int high3=sub3[0];
        int r=0;
        int roll1=0,roll2=0,roll3=0;
        for(int i=1;i<=4;i++){
            if(total[i]>max){
                max=total[i];
                r=roll[i];
            }
            if(sub1[i]>high1){
                high1=sub1[i];
                roll1=roll[i];
            }
            if(sub2[i]>high1){
                high2=sub2[i];
                roll2=roll[i];
            }
            if(sub1[i]>high1){
                high3=sub3[i];
                roll3=roll[i];
            }
        }
        System.out.println("Total Highest Marks are=" +max + "obtained by roll number" +r);
        System.out.println("Highest Marks in Subject A are =" +high1 + "obtained by roll number" +roll1);
        System.out.println("Highest Marks in Subject B are =" +high2 + "obtained by roll number" +roll2);
        System.out.println("Highest Marks in Subject C are =" +high3 + "obtained by roll number" +roll3);
    }
}












