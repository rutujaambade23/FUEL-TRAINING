// Creating a object of Interface class. 

interface A{
  void add(int x,int y);//anonomous class
}
class Test implements A//Concreate class
  {
   // @override
     public void add(int x,int y)
       {
         System.out.println("x+y");
       }
  }
  
public class Demo3
  {
    public static void main(String args[])// main class
      { 
        Test t1= new Test();
        t1.add(10,20);
        
        A ob1=new A()// Creating a object of Interface class.
         {
          //@override 
          
          public void add(int x, int y)
          { 
            System.out.println(x+y);
          }
          };
          ob1.add (100,200);//crated object of interface class and pass the value to the parameters
        }
   }

      

