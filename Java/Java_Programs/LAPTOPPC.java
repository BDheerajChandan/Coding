import java.io.*;
class LAPTOPPC {
     public static void main(String args[]) throws IOException{
         double p,d,net;
         String name,address;
         System.out.println("********* BILL PROGRAM  **********");
         System.out.println("Enter Name of the Customer::");
         InputStreamReader reader = new InputStreamReader(System.in);
         BufferedReader input = new BufferedReader(reader);
         name=input.readLine();
         System.out.println("Enter address customer::");
         address=input.readLine();
         System.out.println("Enter Value of Purchases =");
         String x=input.readLine();
         p = Double.parseDouble(x);
         System.out.println("Name of the Customer::" +name);
         System.out.println("Address of the Customer::"+address);
         System.out.println("L. Enter L for Laptop");
         System.out.println("D. Enter D for Desktop");
         System.out.println();
         System.out.println("Enter your choice::");
         char choice;
         choice=(char)System.in.read();
         System.out.println("Name of the Customer::" +name);
         System.out.println("Address of the Customer::" +address);
         switch(choice) {
             case 'L' : if(p<=25000){
                 d=0;
                 net=p-d;
                 System.out.println("Amount to be paid" +net);
                }
                else if(p>25000 && p<=57000){
                    d=(5.0/100)*p;
                    net=p-d;
                    System.out.println("Amount to be paid" +net);
                }
                else if(p>57000 && p<=100000){
                    d=(7.5/100)*p;
                    net=p-d;
                    System.out.println("Amount to be paid" +net);
                }
                else if(p>100000){
                d=(10.0/100)*p;
                net=p-d;
                System.out.println("Amount to be paid" +net);
                }
                break;
         case 'D': if(p<=25000){
                d=(5.0/100)*p;
                net=p-d;
                System.out.println("Amount to be paid" +net);
                }
                else if(p>25000 && p<=57000){
                d=(7.5/100)*p;
                net=p-d;
                System.out.println("Amount to be paid" +net);
                }
                else if(p>57000 && p<=100000){
                    d=(10.0/100)*p;
                    net=p-d;
                    System.out.println("Amount to be paid" +net);
                    }
                else if(p>100000){
                    d=(15.0/100)*p;
                    net=p-d;
                    System.out.println("Amount to be paid" +net);
                    }
                break;
               }
          }
     }
     
     
     
     
     
     
     
     
     
     
     
     