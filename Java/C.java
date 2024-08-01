import java.util.Scanner;

public class C
 {
  public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a sentence: ");
          String sentence = scanner.nextLine();
           if (isPangram(sentence)) 
            {
             System.out.println("The sentence is a pangram.");
            } 
             else 
            {
            System.out.println("The sentence is not a pangram.");
            }
             scanner.close();
    }
 public static boolean isPangram(String sentence) 
  {       
    sentence = sentence.toLowerCase();        
     boolean[] lettersSeen = new boolean[26];
      int letterCount = 0;
       for (char c : sentence.toCharArray()) 
        {
         if (Character.isLetter(c)) 
          {
           int index = c - 'a';
            if (!lettersSeen[index]) 
            {
             lettersSeen[index] = true;
              letterCount++;
            }
          }
        }
         return letterCount == 26;
    }
}