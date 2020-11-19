import java.util.Scanner; 

public class Trance{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        int mat[][];
        int r1,c1;
        System.out.println("Enter the number of of rows and columns in the First Matrix:");
        r1=myObj.nextInt();
        c1=myObj.nextInt();
        mat=new int[r1][c1];
        System.out.println("Enter the elements in the first matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                mat[i][j]=myObj.nextInt();
            }
        }
        System.out.println("The original matrix is:");
        
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The transpose of the matrix is:");
        
        for(int i=0;i<c1;i++)
        {
            for(int j=0;j<r1;j++)
            {
                System.out.print(mat[j][i]+"\t");
            }
            System.out.println("");
        }
       
        myObj.close();
    }
}
