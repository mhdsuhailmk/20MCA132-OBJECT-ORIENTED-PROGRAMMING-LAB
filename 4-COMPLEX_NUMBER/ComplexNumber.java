import java.util.Scanner;

//main class
public class ComplexNumber
 {
   
   double real, img;
	
   //constructor
   ComplexNumber(double r, double i)
     {
	this.real = r;
	this.img = i;
     }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	//temporary complex number
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        return temp;
   }

   public static void main(String args[])
   {
       
       double rl1,rl2,im1,im2;

       Scanner sc = new Scanner(System.in);

       System.out.println("ENTER THE REAL AND IMAGINARY PART OF FIRST COMPLEX NUMEBR!");
       rl1 = sc.nextDouble();
       im1 = sc.nextDouble();
        
       System.out.println("ENTER THE REAL AND IMAGINARY PART OF SECOND COMPLEX NUMEBR!");
       rl2 = sc.nextDouble();
       im2 = sc.nextDouble();
 
       ComplexNumber c1 = new ComplexNumber(rl1, im1);
       ComplexNumber c2 = new ComplexNumber(rl2, im2);
       ComplexNumber temp = sum(c1, c2);
       System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
  
  }

 }
