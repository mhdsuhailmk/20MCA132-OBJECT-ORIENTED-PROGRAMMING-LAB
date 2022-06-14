class product
{
String pcode,pname;
int price;
void read(String p,Stringn,int pi)
{
pcode = p;
pname = n;
price = pi;
}
}
class product_details
{
public static void main(String args[])
{
product p1 = new product();
product p2 = new product();
product p3 = new product();
p1.read("e43","soap",100);
p2.read("f44","brush",50);
p3.read("k777","phone",25000);
if(p1.price < p2.price && p1.price < p3.price)
{
System.out.println("The lowest price is: "+p1.price);
}
else if (p2.price< p3.price)
{
System.out.println("The lowest price is: "+p2.price);
}
else
{
System.out.println("The lowest price is: "+p3.price);
}
}
}
