import java.io.*;
import java.util.*;

public class lab18 {
    public static void main(String[] args)throws IOException{
        
			int lines=0,chars=0,words=0;
            int code=0;
            Scanner scan= new Scanner(System.in);
            System.out.print("\nEnter File name: ");
            String str = scan.next();

			FileInputStream f = new FileInputStream(str);
			while(f.available()!=0)
			{
				code = f.read();
				if(code!=10)
				chars++;
				if(code==32)
				words++;
				if(code==13)
				{
					lines++;
					words++;
				}
			}
			System.out.println("No.of characters = "+chars);
			System.out.println("No.of words = "+(words+1));
			System.out.println("No.of lines = "+(lines+1));
			f.close();
            scan.close();
	
    }
}
