//Store element and print it........
import java.util.Scanner;
class StoreElement{
public static void main(String[]args){

int i;
int [] arr=new int[]{10};

Scanner sc=new Scanner(System.in);
System.out.println("Read and Print elements if an array");
System.out.println("========================================================");

System.out.println("Enter element ");
i= sc.nextInt();

for(i=0;i<arr.length;i=i+1)
{
System.out.println("Element- nextInt"+i);
}

System.out.println("Element in an array is ");

for(i=0;i<arr.length;i=i+1)
{
System.out.println("Element- nextInt"+i);
}
}
}


