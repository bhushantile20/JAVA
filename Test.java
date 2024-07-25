public class Student
{
	public static void main(String[] args) 
	{
		private int sno;
private String sname;
private int WhichClass;

public Student (int sno,String sname,int whichClass){
this.sno  =sno;
this.sname=sname;
this.whichClass=whichClass;
	}

public boolean equals(Object obj){
if(this==obj){
return true;

} 
else{
if(obj instance Student)
{
  Student s=(Student) obj;


return this.sno==s.sno&&
this.sname.equals(s.sname)&&
this.whichClass==s.whichClass;
}
else
{
return false;
         }   
}
}
}     

class Address{}
class Test
{
public static void main(String args[])
{
Student s1=new Student(1,"hari",12);
Student s2=new Student(2,"Bhushan",12);
Student s3=new Student(3,"Tile",12);
Student s4=s2;

System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println();

System.out.println(s1==s3);
System.out.println(s1.quals(s3));
System.out.println();

Addres
}