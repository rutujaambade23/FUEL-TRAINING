/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on 
the outside and the longer string on the inside. The strings will not be the same length, but they 
may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".*/



import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR STRING");
        String a = scanner.next();
        String b = scanner.next();
        if(a.length() > b.length())
        System.out.println(b+a+b);
        else
        System.out.println(a+b+a);
    }
}