import java.io.FileInputStream;
import java.io.FileNotFoundException;
//checked exception
//unchecked exception
class Demo2 {
    static void fun1()throws FileNotFoundException {
        try {
            FileInputStream fin;
            fin=new FileInputStream("c:/demo/data.txt");
             
        } catch (FileNotFoundException e) {
             throw e;
        }
    }
  public static void main(String[] args) {
      fun1();
  }  
}
