class AverageValue{
public static void main(String[] args){
int [] arr = new int [] {20,30,25,35,-16,60,-100}; 
int sum=0;
for(int i=0;i<arr.length;i=i+1)
sum=sum+arr[i];
double average=sum/arr.length;
System.out.println("Average value of array elemet is:"+average);
}
}