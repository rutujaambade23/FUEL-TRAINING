import java.util.Scanner;
class demo1{
public static void main(String args[])
{
String name;
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
System.out.println("Enter age");
name=sc.next();
age=sc.nextInt();

System.out.println("Hello"+name+". Your age is" +age);
}
}
