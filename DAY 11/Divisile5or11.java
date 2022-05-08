import java.util.*;
class Divisile5or11
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int x;
System.out.println("Enter any number:");
x=sc.nextInt();
if(x%11==0 && x%5==0)
{
System.out.println("Number is divisible");
}
else 
{
System.out.println("Not divisible");
}
}
}





