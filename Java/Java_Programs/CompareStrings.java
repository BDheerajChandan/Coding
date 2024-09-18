class CompareStrings {
public void main() {
String s1,s2;
s1="VIKAS";
s2=s1;
System.out.println("Same Thing ?" +(s1==s2));
s2=new String (s1);
System.out.println("Same Thing ?" +(s1==s2));
System.out.println("Same Result ?" +s1.equals(s2));
}
}
