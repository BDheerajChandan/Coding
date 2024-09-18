import java.io.*;
class FunctionOverloading {
       void Menu() throws IOException {
System.out.println("********* M E N U **********");
System.out.println("s. Square of Integer");
System.out.println("p. Product of integers");
System.out.println("e. Equality of Strings");
System.out.println();
System.out.println("Enter your choice::");
}
void num_calc(int num,char ch){
System.out.println("Choice=" +ch);
System.out.println("Number=" +num);
int square = num*num;
int cube=num*num*num;
      if(ch=='s')
    System.out.println("Square of the Number is =" +square);
else
    System.out.println("Cube of the Number is =" +cube);
}
void num_calc(int a, int b, char ch){
System.out.println("Choice=" +ch);
System.out.println("Number1=" +a);
System.out.println("Number2=" +b);
int product = a*b;
int sum=a+b;
if(ch=='p')
     System.out.println("Product of the Numbers is =" +product);
else
     System.out.println("Sum of the Numbers is =" +sum);
 	}
void num_calc(String s1, String s2){
System.out.println("First String:" +s1);
System.out.println("Second String:" +s2);
       if(s1.equals(s2))
System.out.println("Strings are equal");
else
System.out.println("Strings are not equal");
}
 }
