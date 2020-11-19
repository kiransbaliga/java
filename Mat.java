import java.util.Scanner;

public class Mat {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int mat1[][],mat2[][],mat3[][];
        int r1,c1,r2,c2,sum=0;
        System.out.println("Enter the number of of rows and columns in the First Matrix:");
        r1=scan.nextInt();
        c1=scan.nextInt();
        System.out.println("Enter the number of of rows and columns in the Second Matrix:");
        r2=scan.nextInt();
        c2=scan.nextInt();
        if(c1==r2)
        {
        mat1=new int[r1][c1];
        mat2=new int[r2][c2];
        mat3=new int[r1][c2];
        System.out.println("Enter the elements in the first matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                mat1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the elements in the second matrix");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                mat2[i][j]=scan.nextInt();
            }
        }
        
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                sum=0;
                for(int k=0;k<c1;k++)
                {
                  sum+=(mat1[i][k]*mat2[k][j]);
                }
                mat3[i][j]=sum;
            }
        }
        System.out.println("The First matrix is");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(mat1[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The Second matrix is");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(mat2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The resultant matrix is");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(mat3[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    else
    {
        System.out.println("Multiplication not possible");
    }
        scan.close();  
    }
}
