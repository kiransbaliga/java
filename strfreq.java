import java.util.*;
public class strfreq {
    public static void main(String[] args){
        String s;
        int cnt=0;
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string:");
        s=scan.nextLine();
        System.out.print("Enter the char to be counted:");
        ch=scan.next().charAt(0);
        for(int i=0;i<s.length();i=i+1)
        {
            if (ch==s.charAt(i))
            cnt+=1;
        }
        System.out.print(ch+" occurs "+cnt +" Times");
        scan.close();
    }
}
