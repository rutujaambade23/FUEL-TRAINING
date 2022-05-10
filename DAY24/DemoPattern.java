import java.util.ArrayList;

class Student implements Cloneable{
 ArrayList<String>students;
 Student(){
 students=new ArrayList<>();
 }
 Student(ArrayList<String>students){
 this.students=students;
 }
 void loadData(){
 students.add("A");
 students.add("B");
 students.add("C");
 students.add("D");
 }
 voidshowData(){
 for(String s:students){
 System.out.println(s);
 
 }
 }
 @override
 protected Object clone()throws CloneNotSupportedException{
 ArrayList<String>temp=new ArrayList<String>();
 for(String s:this.students){
 temp.add(s);
 }
 return new Student(temp);
 }
}
public class DemoPattern{
public static void main(String[]args)throws CloneNotSupportedException{
Student st1=new Student();
st1.loadData();
Student st2=(Student)st1.clone();
st1.showData();
st2.showData();
}
}

}

}
 
 