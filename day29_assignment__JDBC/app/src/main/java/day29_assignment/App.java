/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package day29_assignment;
import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("********************************************************************");
        System.out.print("\t Login to Database   ");
        long millis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        System.out.print(date);
        System.out.println(" \n *****************************************************************");
        System.out.print("\t Enter the UserName : Default (postgres) ");
        String user_name = sc.next();
        System.out.print("\t Enter the Password :  ");
        String pass_word = sc.next();

        Student st = new Student();
        st.setId(1800);
        st.setName("abcdefgh");
    
        StudImpl ob;
        ob = new StudImpl();
        do {

            System.out.println("------------------------------------------------------");
            System.out.println("\t\t Database Application Version 1.0   ");
            System.out.println("-------------------------------------------------------");
            System.out.println("\t\t  1.Insert Value  \n"
                    + "\t\t  2.Delete Value \n"
                    + "\t\t  3.Select Value  \n"
                    + "\t\t  4.Update Value \n"
                    + "\t\t  5.Exit \n");

            System.out.print("\t  Enter Choice : ");
            int choice = sc.nextInt();

            if (choice == 1) {
                ob.insert(st);
            } else if (choice == 2) {
                ob.delete(st);
            } else if (choice == 3) {
                ob.select(st);
            } else if (choice == 4) {
                ob.update(st);
            } else if (choice == 5) {
                ob.getStud(100);
            } else if (choice == 6) {

                System.out.println("Successfully logout !");
                System.exit(9);
            }
        } while (true);

    }
}