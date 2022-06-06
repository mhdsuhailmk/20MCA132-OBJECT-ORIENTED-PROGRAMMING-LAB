//exceptionclass
class InvalidCredentialsException extends Exception
{

 public InvalidCredentialsException (String str)
  {
    super(str);
  }

}



//mainclass
public class Main
{

 static void validate(String uname,int password) throws InvalidCredentialsException
  {

   if (uname != "user" && password != 1234)
    {
      throw new InvalidCredentialsException("INVALID CREDENTIALS!......");
    }
   
  else
   { 
    System.out.println("WELCOME!..");
   }

  }


 public static void main(String ar[])
  {
    String username=ar[0];
    int password=Integer.parseInt(ar[1]);
 
   try
    {
     validate(username,password);
    }

  catch (InvalidCredentialsException e)
   {
    System.out.println("Caught the exception");
    System.out.println("Exception occured"+e);
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


