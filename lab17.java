import java.util.*;
import java.io.*;

public class lab17 {
    public static void main(String[] args) throws IOException {
        int j = 1;
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter File name: ");
        String str = scan.next();
        FileInputStream f = new FileInputStream(str);
        System.out.println("\nContents of the file are");
        int n = f.available();
        System.out.print("line "+j + " contains: ");
        for (int i = 0; i < n; i++) {
            ch = (char) f.read();
            System.out.print(ch);
            if (ch == '\n') {
                System.out.print("line "+ ++j + " contains: ");

            }

        }
        f.close();
        scan.close();

    }
}
