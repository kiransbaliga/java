import java.io.*;
import java.util.*;

public class labappend {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter File name: ");
        String str = scan.next();
        FileOutputStream f = new FileOutputStream(str,true);
        
        System.out.println("Enter line to be appended:");
        String wr=scan.next();
        byte s[]=wr.getBytes();
        f.write(s);
        System.out.println("String is appended to the file");
        f.close();
        
        scan.close();
    }
}
