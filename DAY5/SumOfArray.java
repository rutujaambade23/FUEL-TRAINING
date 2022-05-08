import java.util.*;
class SumOfArray{
public static void main(String[] args){
int [] arr = new int [5];
int i;
int sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter elements");
for(i=0; i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
System.out.println("Your array is: ");
for(i=0;i<arr.length;i=i+1)
{
System.out.println("arr[i] ");
}
}
}