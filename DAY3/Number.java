//to find maximum between three numbers//
import java.util.Scanner;
class Number 
{
    public static void main(String[] args) 
    {
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        x = sc.nextInt();
        if(x > 0)
        {
            System.out.println(" number is positive");
        }
        else if(x < 0)
        {
            System.out.println(" number is negative:");
        }
        else
        {
            System.out.println(" number is equals to 0:");
        }
 
    }
}