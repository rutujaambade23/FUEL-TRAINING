import java.util.*;
class FibSr
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int n1=0,n2=1,sum=0,i,lst;
System.out.println("Enter How many number you want?: ");
lst=sc.nextInt();

for(i=2;i<=lst;i++)
{
sum=n1+n2;
n1=n2;
n2=sum;
System.out.println(sum+" ");
}
}
}
