import java.util.Scanner;
/**
 * Write a description of class divisible here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number");
        int usernumber = number.nextInt();
        int divisibility= usernumber % 7;
        while(divisibility != 0)
        {
            System.out.println("Not divisible by 7");
            System.out.println("Enter a number");
            usernumber = number.nextInt();
            divisibility= usernumber % 7;
        }
        
        System.out.println("divisible by 7 \nProgram ended");
    }
}
