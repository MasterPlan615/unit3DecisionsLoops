import java.util.Scanner;
public class Spectrum
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperature: ");
        int tem = scan.nextInt();
        System.out.println("Degrees: ");
        String deg = scan.next().toLowerCase();
        System.out.println("Altitude(feet): ");
        int alt = scan.nextInt();
        int drop = alt/1000;
        if (deg.equals("c"))
        {
            if ((tem-drop) < 100)
            {
                if ((tem-drop) <= 0)
                {
                    System.out.println("Solid");
                }
                else
                {
                    System.out.println("Liquid");
                }
            }
            else
            {
                System.out.println("Gas");
            }
        }
        else if (deg.equals("f"))
        {
            if ((tem-drop) < 212)
            {
                if ((tem-drop) <= 32)
                {
                    System.out.println("Solid");
                }
                else
                {
                    System.out.println("Liquid");
                }
            }
            else
            {
                System.out.println("Gas");
            }
        }
        else
        {
            System.out.println("Incorrect degree");
        }
   }
}