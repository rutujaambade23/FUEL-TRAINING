import java.util.*;
class Compared
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int x,y,z;
System.out.println("Enter three number:");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if(x>=y && x>=z)
{
System.out.println("Max num:"+x);
}
else if(y>=x && y>=z)
{
System.out.println("Max num:"+y);
}
else if(z>=x && z>=y)

{
System.out.println("Max num:"+z);
}
}
}





