import java.util.*;

//exceptionclass
class NegativeNumberException extends Exception
{
 public NegativeNumberException (String str)
 {
    super(str);
 }
}

class Avg
{
 
 void validate() throws NegativeNumberException
 {
	Scanner sc = new Scanner(System.in);
	int total,i,sum = 0,avg;
	int arr[] = new int[30];
 	System.out.println("================");
	System.out.println("ENTER THE TOTAL NUMBER OF INTEGERS");
	total = sc.nextInt();  
	System.out.println("================");
	System.out.println("ENTER THE INTEGERS");
 
	for (i=0;i<total;i++)
	{
	int v = sc.nextInt();
		
		if(v < 0) 
		{    
			System.out.println(v);
			throw new NegativeNumberException( " "+v+" IS A NEGATIVE NUMBER......");
		}

		else
		{      // System.out.println(v);
			arr[i] = v;
			sum = sum + v;
		}
	//endfor
	}
	
	avg = sum/total;
	System.out.println("================");
	System.out.println("AVERAGE OF THE NUMBERS IS:"+avg);
 
 //endvalidate   
 }

}

//mainclass
public class Main
{

 public static void main(String ar[])
 {
    
	try
	{
		Avg obj = new Avg();
		obj.validate();
	}

	catch (NegativeNumberException e)
	{
		System.out.println("================");
		System.out.println("Caught the exception!. :::");
		System.out.println("Exception occured!.."+e);
	} 

	finally
	{
		System.out.println("================");
		System.out.println("THANK YOU!");
		//restofcodeifany
	} 

 }

//endofclsmain
}


