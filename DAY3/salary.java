import java.util.Scanner;
class salary
{
    public static void main(String args[])
    {
    double basic=20000.50,gross,da,hra;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Basic Salary :- ");
    basic = in.nextDouble();
    if(basic <=10000)
    {
        da = basic * 0.8;
        hra = basic *0.2;
    }    
        else if(basic <=20000)
    {
        da = basic * 0.9;
        hra = basic *0.25;
    }
    else
    {
        da = basic * 0.95;
        hra = basic * 0.3;
    }
    gross = basic + da + hra;
    System.out.println("The Gross Salary is :-"+gross);   
}
}