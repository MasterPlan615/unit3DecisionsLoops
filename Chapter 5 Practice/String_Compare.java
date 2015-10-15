

public class String_Compare
{
    public static void main( String[] args )
    {
        String word1 = "catalog";
        String word2 = "cat";
        int result = word1.compareTo("aaa");
        System.out.println(result);
        if (word1.equals(word2))
        {
            System.out.println("Word1 is equal to Word2");
        }
        else
        {
            System.out.println("Word1 is NOT equal to Word2");
        }
        int result2 = word1.compareTo(word2);
        System.out.println(result2);
        if ((word1.substring(0,3)).equals((word2.substring(0,3))))
        {
            System.out.println("Word1 3-prefix is equal to Word2 3-prefix");
        }
        else
        {
            System.out.println("Word1 3-prefix is NOT equal to Word2 3-prefix");
        }
    }
}
