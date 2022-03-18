import java.util.Scanner;
class RectArea
{

 public static void main(String ar[])
  {
   System.out.println("FINDING AREA,PERIMETER OF RECTANGLE!...");
   Display ob=new Display();
   ob.find();
  }

}


class Display
{
 int l,w,area,peri;
 Scanner sc=new Scanner(System.in);
 
 public void find()
  {
   System.out.println("ENTER THE LENGHT..");
   l=sc.nextInt();
   System.out.println("ENTER THE WIDTH..");
   w=sc.nextInt();
  
   area=l*w;
   peri=2*(l+w);
  
   System.out.println("AREA IS:"+area);
   System.out.println("PERIMETER IS:"+peri);
  }
}
