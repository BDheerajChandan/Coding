public class chartoLowerCase {
void count() {
   String text = "I am studying in ICSE 10th class";
   int spaces = 0,vowels = 0,letters = 0;

   int textLength = text.length();         // Get string length
   for(int i = 0; i < textLength; i++) {
    char ch = Character.toLowerCase(text.charAt(i));
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    vowels++;
    }
   if(Character.isLetter(ch)) {
    letters++;
    }
    if(Character.isWhitespace(ch)) {
      spaces++;
      }
    }
    int consonants=letters-vowels;
    System.out.println("The text contains vowels: " + vowels + "\n" +"consonants:" +consonants + "\n"+" spaces: " + spaces);
}
}



