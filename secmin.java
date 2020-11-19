import java.util.*;
public class secmin {
    public static void main(String[] args)
    {
        int n,i,min1=1000,ans=999;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size:");
        n=scan.nextInt();
        int ar[]=new int[n];

        System.out.println("Start entering");
        for(i=0;i<n;i=i+1)
        {
            ar[i]=scan.nextInt();
        }
    
        if (ar[0]>ar[1])
        {
            ans=ar[0];
            min1=ar[1];
        }
        else
        {
            ans=ar[1];
            min1=ar[0];
        }
        for(i=2;i<n;i=i+1)
        {   
            if (min1==ans)
            {
                ans=ar[i];
            }
            if(ar[i]<min1 && ar[i]<ans)
            {
                ans=min1;
                min1=ar[i];
            }
            else if(ar[i]<ans && ar[i]>min1)
            {
                ans=ar[i];
            }
        }
        System.out.println("Second min is "+ans);
        scan.close();
    }
   
}
