import java.util.Scanner;


public class PalindromeTester
{
    /**
     * Tests strings to see if they are palindromes.
     *
     */
   public static void main (String[] args)
   {
      String str, another = "y";
      int left, right;
      Scanner s = new Scanner(System.in);

      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         System.out.println ("Enter a potential palindrome:");
         str = s.nextLine();

         left = 0;
         right = str.length() - 1;
         for(int i = 0; i != str.length(); i++)
         {
             if(left < right && str.charAt(left) == str.charAt(right))
             {
                 left++;
                 right--;
             }
             if(left < right && str.charAt(left) != str.charAt(right))
             {
                 if(str.charAt(left) == ' ' )
                 {
                     left++;
                 }
                 else if(str.charAt(right) == ' ' )
                 {
                     right--;
                 }
             }
         }
         

         System.out.println();

         if (left < right)
         {
            System.out.println ("That string is NOT a palindrome.");
         }
         else
         {
            System.out.println ("That string IS a palindrome.");
         }
         System.out.println();
         System.out.print ("Test another palindrome (y/n)? ");
         another = s.nextLine();
      }
   }
}
