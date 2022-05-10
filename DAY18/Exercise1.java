

import java.util.*;


public class Exercise1 {

public ArrayList<Integer> list = new ArrayList<>();

public ArrayList<Integer>saveEvenNumbers(int N) {
     
     list = new ArrayList<Integer>();
     
     for(int i=2;i<N;i++)
     {
         if(i%2 == 0)
         {
             list.add(i);
         } 
         
              
     }
return list;
}



public ArrayList<Integer>printEvenNumber() {

     ArrayList<Integer> newList = new ArrayList<Integer>();     
     for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
}


public static void main(String[] args)
{
    
    Exercise1 e1 = new Exercise1();
    e1.saveEvenNumbers(10);
    e1.printEvenNumber();


}
}