import java.util.*;
class CheckVowel
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
char ch;
String s1;
int x;
System.out.println("Enter any character:");
s1=sc.next();
ch=s1.charAt(0);
x=ch;
if(x==65 || x==69 || x==73 || x==79 || x==85 || x==97 || x==101 || x==105 || x==111 || x==117)
{

System.out.println("Is Vowel");
}
else
{
System.out.println("Is Consonant");
}
}
}

