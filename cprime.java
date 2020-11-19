import java.util.*;
class cprime {
    public static void main(String[] args) {
        int i;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number:");
        i=scan.nextInt();
        scan.close();
        int flag=1;
        if (i==1 || i==0)
        System.out.print("not prime nor composite");
        else{
        for(int j=2;j<=i/2;j++)
        if(i%j==0)
        {
            flag=0;    
        }
        if(flag==0)
        {
            System.out.print("Not Prime");

        }
        else
        System.out.print("Prime");
    }
}
}