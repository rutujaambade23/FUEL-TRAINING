// DataOutputStream
import java.io.*;
public class Demo2 {
    public static void main(String[] args)throws Exception {
               
        FileOutputStream fout;
        fout=new FileOutputStream("C:\\Users\\admin\\Desktop\\JAVA\\DAY17\\test3.txt");
        DataOutputStream dout;
        dout=new DataOutputStream(fout);
        dout.writeInt(102);
        dout.writeBoolean(true);
        dout.writeDouble(1.2);
       dout.close();
    }

}

