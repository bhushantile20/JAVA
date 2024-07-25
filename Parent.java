class Bike
{
	String bikeNumber;
	String bikeName;
	int modelNumber;
	String engineNumber;
	
	void engineStart()
	{
	}
	void move()
	{}
	void engineStop(){}
	
}

class Student
{
	int sno;
  String sname;
  String course;
  double fee;
  
  void goingToCollegeBy(Bike b){
	  System.out.println(this.sname+"is going to college by"+b.bikeName+"bike");
  }
}

class Parent
{
  public static void main(String args[])
	{
	  Bike pulsar=new Bike();
	  pulsar.bikeNumber="8192";
	  pulsar.bikeNumber="pulsar 180";
	  pulsar.modelNumber=2024;
pulsar.engineNumber="3343435";
Student hk=new Student();
hk.sno=1;
hk.sname="harikrishna:";
hk.course="java";
hk.fee=5000;

hk.goingToCollegeBy(pulsar);
}
}
	  