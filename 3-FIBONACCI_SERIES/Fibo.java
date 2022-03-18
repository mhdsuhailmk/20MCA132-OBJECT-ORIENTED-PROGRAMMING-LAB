import java.util.Scanner;
class Fibo
{

public static void main(String ar[])
 {
   System.out.println("FIBONACCI SERIES...");
   Dis ob=new Dis();
   ob.find();  
 }

}


class Dis
{
 int first=0,second=1,third,i,limit,count=0;
 Scanner sc=new Scanner(System.in);

 public void find()
  {
    System.out.println("ENTER THE LIMIT");
    limit=sc.nextInt();
    System.out.println("THE FIRST "+limit+ " FIBONACCI SERIES ARE...");

    while(count<limit)
     {
      third=first+second;
      System.out.println(third);
      first=second;
      second=third;
      count=count+1;
     }

}


}
