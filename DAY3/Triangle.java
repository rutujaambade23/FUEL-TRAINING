import java.util.*;
class Triangle
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 angles:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b+c==180)
		{
			if(a<90 && b<90 && c<90)
				System.out.println("Acute angled triangle");
			else if(a>90 || b>90 || c>90)
				System.out.println("Obtuse angled triangle");
			else
				System.out.println("Right angled triangle");
		}
		else
		System.out.println("Cannot form a triangle");
	}
}