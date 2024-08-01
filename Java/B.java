import java.util.Scanner;

public class B 
 {
   public static void main(String[] args) 
     {       
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
         String roman = scanner.nextLine().toUpperCase(); 
          int result = romanToInt(roman);
           System.out.println("The integer value is: " + result);
            scanner.close();
     }

    public static int romanToInt(String s) 
     {
      int result = 0;
      int prevValue = 0;
       for (int i = s.length() - 1; i >= 0; i--) 
        {
         char ch = s.charAt(i);
          int currentValue = getRomanValue(ch);
           if (currentValue < prevValue) 
            {
                result -= currentValue;
            } 
            else 
            {
               result += currentValue;
            }
                prevValue = currentValue;
        }

        return result;
    }

    private static int getRomanValue(char ch) 
     {   
        if (ch == 'I') return 1; 
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        throw new IllegalArgumentException("Invalid Roman numeral character: " + ch);
    }
}