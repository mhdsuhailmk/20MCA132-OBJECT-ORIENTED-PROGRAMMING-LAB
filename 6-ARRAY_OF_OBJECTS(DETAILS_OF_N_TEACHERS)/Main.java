import java.util.*;
import java.lang.*;

class Main
{

 public static void main(String ar[])
 {
   Teacher[] obj = new Teacher[5] ;
  
   obj[0] = new Teacher("ALEX","MALE","SKYLINE",25,"ZOHO","MCA",15,550,"OOPS","DCA",5);
   obj[0].display();

   obj[1] = new Teacher("RAJ","MALE","SFC",35,"AMAZON","MCS",14,510,"NCA","TCS",45);
   obj[1].display();
   
   obj[2] = new Teacher("JOHN","MALE","MRF",45,"ORACLE","MCT",17,610,"TCW","MCS",75);
   obj[2].display();
   
   obj[3] = new Teacher("ANGELINA","FEMALE","LRF",25,"TECH.M","CS",12,710,"POP","MKR",75);
   obj[3].display();
 }

//endofmain
}



class Person
{

 String name;
 String gender;
 String address;
 int age;

 //constructor
 public Person(String name,String gender,String address,int age)
 {
   this.name = name; 
   this.gender = gender;
   this.address = address;
   this.age = age;
 }

}



class Employee extends Person
{

 int emp_id,salary;
 String comp_name;
 String qualification;

 //constructor
 public Employee(String name,String gender,String address,int age,String comp_name,String qualification,int emp_id,int salary)
 {
   super(name,gender,address,age);
   this.comp_name = comp_name;
   this.qualification = qualification;
   this.emp_id = emp_id;
   this.salary = salary;
 }

}



class Teacher extends Employee
{

 String subject;
 String dept;
 int teacher_id;
 
 //constructor
 public Teacher (String name,String gender,String address,int age,String comp_name,String qualification,int emp_id,int salary,String subject,String dept,int teacher_id)
 {
   super(name,gender,address,age,comp_name,qualification,emp_id,salary);
   this.subject = subject;
   this.dept = dept;
   this.teacher_id = teacher_id;
 }


 //display_method
 public void display()
 {
   System.out.println( " " );
   System.out.println( " =====================" );
   System.out.println( "  NAME : "+name);
   System.out.println( "  GENDER : "+gender );
   System.out.println( "  ADDRESS : "+address );
   System.out.println( "  AGE : "+age );
   System.out.println( "  COMPANY : "+comp_name );
   System.out.println( "  QUALIFICATION : "+qualification);
   System.out.println( "  SALARY : "+salary);
   System.out.println( "  SUBJECT : "+subject);
   System.out.println( "  DEPARTMENT : "+dept);
   System.out.println( "  TEACHER_ID : "+teacher_id);
   System.out.println( " ======================" );
   System.out.println( " " );

 }

//endofcls
}


