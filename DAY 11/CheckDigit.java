import java.util.*;
class CheckDigit
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
char ch;
String s1;
int x;
System.out.println("Enter any character:");
s1=sc.next();
ch=s1.charAt(0);
x=ch;
if(x>=65 && x<=90)
{
System.out.println("Capital");
}
else if(x>=97 && x<=122)
{
System.out.println("Small");
}
else if (x>=47 && x<=58)
{
System.out.println("Digit");
}
else
{
System.out.println("I don't know this CHaracter");
}
}
}


