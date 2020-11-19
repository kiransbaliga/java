import java.io.*;
import java.util.*;
public class file1 {
    public static void main(String args[]){
		
		int c;
		FileInputStream fin = null;
		
		try {
		fin = new FileInputStream("2file.txt");
		}
		catch(FileNotFoundException ex) {
			System.out.println("File Can not open");
		}
		try {
			
			while((c= fin.read()) != -1) {
				System.out.print((char)c);
			}
		}
		catch(IOException e) {
			System.out.println("Error reading File");
		}
		
		
		FileOutputStream fout = null;
		System.out.println("\nEnter a text to the file ");
		Scanner input = new Scanner(System.in);
		String str = new String();
		str = input.nextLine();
		byte s[]=str.getBytes();
		try {
			fout = new FileOutputStream("2file.txt",true);
		}
		catch(FileNotFoundException ex) {
			System.out.println("File can't create");
		}
		try {
			fout.write(s);
			System.out.println("File writing completed successfull");
		}
		catch(IOException e) {
			System.out.println("Error write in to file");
		}
		finally {
			try {
				if (fout != null) fin.close();
				
			}
			catch(IOException e) {
				System.out.println("Error Closing File");
			}
			try {
				if(fout != null) fout.close();
			}
			catch(IOException e) {
				System.out.println("Error closing file");
			}
		}
	}
}
