import java.util.*;
class Pattern
{

 public static void main(String ar[])
  {
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("PATTERN!...");
    System.out.println("ENTER THE LIMIT:");
    n=sc.nextInt();
    System.out.println("THE PATTERN IS..");

    for(i=1;i<=n;i++)
     {
       for(j=0;j<i;j++)
        {
         System.out.print(i+" ");
        }
       System.out.println(" ");

    }

  }

}
