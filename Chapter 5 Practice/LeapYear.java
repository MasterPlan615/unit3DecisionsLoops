import java.util.Scanner;
public class LeapYear
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose first number: ");
        int num1 = scan.nextInt();
        System.out.println("Choose second number: ");
        int num2 = scan.nextInt();
        System.out.println("Choose third number: ");
        int num3 = scan.nextInt();
        if ((num1>num2)&&(num2>num3))
        {
            System.out.println("Decreasing");
        }
        else if ((num1<num2)&&(num2<num3))
        {
            System.out.println("Increasing");
        }
        else
        {
            System.out.println("Neither");
        }
    }
}