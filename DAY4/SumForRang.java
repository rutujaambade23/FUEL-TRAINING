//sum of range for sequential integers

import java.util.*;
class SumForRang
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int snm,i,enm,sum=0;
System.out.println("Enter Start:");
snm=sc.nextInt();
System.out.println("Enter End:");
enm=sc.nextInt();
for(i=snm;i<=enm;i=i+1)
{
sum=sum+i;
}
System.out.println(sum);
}
}