//WAP to convert meter to feet & meter to inchesv
import java.util.Scanner;
class demo4
{
public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Value in Meters :");
  double meter = input.nextDouble();
  double feet = meter * 3.28084;
  System.out.print(meter + " Meters = "+ feet + " Feets");
 }}
 
 
 