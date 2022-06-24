import java.util.Scanner;
 
public class MainClass 
{
    public static void main(String args[])
    {
        System.out.println("Enter The Value For N :");
         
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        
        int[][] spiral = new int[n][n];
         
        int counter = 1;
         
        int startCol = 0;
         
        int endCol = n-1;
         
        int startRow = 0;
         
        int endRow = n-1;
         
        while (startCol <= endCol && startRow <= endRow)
        {
            for (int i = startCol; i <= endCol; i++)
            {
                spiral[startRow][i] = counter;
                     
                counter++;
            }
            startRow++;
             
            for (int i = startRow; i <= endRow; i++) 
            { 
                spiral[i][endCol] = counter; 
                 
                counter++; 
            }
            endCol--;
             
            for (int i = endCol; i >= startCol; i--)
            {
                spiral[endRow][i] = counter;
                             
                counter++;
            }
            endRow--;
             
            for (int i = endRow; i >= startRow; i--) 
            {
                spiral[i][startCol] = counter;
                 
                counter++;
            }
            startCol++;
        }
         
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }
             
            System.out.println();
        }
    }
}