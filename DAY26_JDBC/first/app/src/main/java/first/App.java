//{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}
import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the User Name:  ");
        String user_name = sc.next();
        System.out.println("Enter the Password:  ");
        String pass_word = sc.next();

        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo1", user_name, pass_word);

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        System.out.println("Enter the Id:  ");
        int id = sc.nextInt();
        System.out.println("Enter the Name:  ");
        String name = sc.next();
        String sql;
        sql="insert into student values("+id+","+name+")";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();
    

    }
}

