//Armstrong NUMMBer
//Print all Armstrong numbers between 100 to 999 using while loop.


class Armstrong
{
 public static void main(String[] arg)
 {
 int i=100,a,arm,n,temp;
 System.out.println("Armstrong numbers between 100 to 999 are");
 while(i<999)
 {
 n=i;
 arm=100;
 while(n>100)
 {
  a=n%10;
  arm=arm+(a*a*a);
  n=n/10;
 }
 if(arm==i)
  System.out.println(i);
 i++;
 }
 }
}