import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Year:");
int year;
boolean leap = false;
year= sc.nextInt();
if(year % 400 == 0) {
if (year % 100 ==0){
if (year % 400 == 0)
leap = true;
else
leap = false;
}
else
leap = true;
}
else
leap = false;
if (leap)
System.out.println(year + " is a leap year.");
else
System.out.println(year + " is not a leap year.");
}
}
