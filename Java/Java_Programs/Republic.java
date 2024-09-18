public class Republic {
  public static void main(String args[]) {
  String s = "January 26 is celebrated as the Republic Day of India";
  int position1 = s.indexOf("January 26");
  int len = s.length();
  int len1 = "January 26".length();
  String str = s.substring(len1+1, len);
  String s1 = "August 15 " +str;
  int len2 = s1.length();
  int position2 = s1.indexOf("Republic ");
  int len3 = "Republic".length();
  String s2 = s1.substring(0,position2);
  String s3 = s1.substring(position2 + len3+1, len2);
  System.out.println("Final String=" +s2 + " Independence " + s3);
  }
}