// Square numbers

class SquareNumbers{
public static void main(String args[]){
int [] arr ={5,6,2,7,3,4};
for(int i=0;i<arr.length;i++)
{
arr[i]=(int)Math.pow(arr[i],2);
}
for (int value:arr)
{
System.out.println(value);
}
}
}