import java.util.Scanner;

class MatrixAdd
{
 public static void main(String ar[])
 {

  Scanner sc = new Scanner(System.in);
  int [][] matA = new int [10][10];
  int [][] matB = new int [10][10];
  int [][] matC = new int [20][20];
  int m,n,i,j;
  
  System.out.println("MATRIX ADDITION!");
  System.out.println("ENTER THE NUMBER OF ROWS");
  m = sc.nextInt();
  System.out.println("ENTER THE NUMBER OF COLUMNS");
  n = sc.nextInt();
 
  System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX");
 
  for(i = 0;i < m;i++)
  { 
    for(j = 0;j < n;j++)
    {
     matA[i][j] = sc.nextInt();
    }
  }

  System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX");
 
  for(i = 0;i < m;i++)
  { 
    for(j = 0;j < n;j++)
    {
     matB[i][j] = sc.nextInt();
    }
  }

  System.out.println("\nTHE ELEMENTS OF FIRST MATRIX:\n");
 
  for(i = 0;i < m;i++)
  { 
    for(j = 0;j < n;j++)
    {
     System.out.print(" ");
     System.out.print(matA[i][j]);
    }
    System.out.println(" ");
  }

  System.out.println("\nTHE ELEMENTS OF SECOND MATRIX:\n");
 
  for(i = 0;i < m;i++)
  { 
    for(j = 0;j < n;j++)
    {
      System.out.print(" ");
      System.out.print(matB[i][j]);
    }
    System.out.println(" ");
  }

  System.out.println("\nTHE SUM IS:\n");

  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
     matC[i][j]=matA[i][j]+matB[i][j];
     System.out.print(" ");
     System.out.print( matC[i][j]);
    }
    System.out.println(" ");
  }

 //endmain
 }

//end
}
