class Employees
{
	String Name,Address;
	int Age;
	long Phone_Number;
	float Salary;
	Employees(String a,int b,long c,String d,float e)
	{
		Name=a;
		Age=b;
		Phone_Number=c;
		Address=d;
		Salary=e;
	}
	void print_Salary()
	{
		System.out.println("Salary: "+Salary);
	}
	
}
class Manager extends Employees
{
	String department;
	Manager (String a,int b,long c,String d,float e,String de)
	{
		super(a,b,c,d,e);
		department=de;
	}
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Phone Number: "+Phone_Number);
		System.out.println("Address:"+Address);
		print_Salary();
		System.out.println("Department: "+department);
		System.out.println();
	}
}
class Officer extends Employees
{
	String specialization;
	Officer (String a,int b,long c,String d,float e,String sp)
	{
		super(a,b,c,d,e);
		specialization=sp;
	}
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Phone Number: "+Phone_Number);
		System.out.println("Address:"+Address);
		print_Salary();
		System.out.println("Specialisation: "+specialization);
		System.out.println();
	}
}
public class Employ {

	public static void main(String[] args) {
		Manager M=new Manager("Harry",19,123920300,"chalakkudy",25000,"CS Department");
		Officer O=new Officer("Severus",24,2111793,"Mala",50000,"CSE");
		System.out.println("class:Manager");
		System.out.println();
		M.display();		
		System.out.println("class:Officer");
		System.out.println();
		O.display();
	}

}
