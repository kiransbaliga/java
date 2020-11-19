import java.util.*;
public class lab16 {
    public static void main(String[] args){
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers:");
        String s = sc.nextLine();
        StringTokenizer token = new StringTokenizer(s, " ");
        while (token.hasMoreTokens()) {
            String temp = token.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}
