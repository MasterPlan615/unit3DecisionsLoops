
public class NestedLoops
{
    public static void main(String[] args)
    {
        int left = 1;
        
        for (int i = 0; i < 2; i++)
        {
            int right = 1;
            for (int i2 = 0; i2 < 4; i2++)
            {
               System.out.print(left);
               System.out.println(right);
               right++;
            }
            left++;
        }
    }
}
