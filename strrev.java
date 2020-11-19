import java.util.Scanner;
public class strrev {
    public static void main(String[] args){
        String s,rev="";
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string t0 be reversed:");
        s=scan.nextLine();
        int len=s.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
            
        }
        System.out.println("Reverse of "+s+" is "+rev);
        scan.close();
    }
    
}
