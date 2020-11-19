class Employee{
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	void calcSalary()
	{
		System.out.println("Salary of employee is 10000");
	}
}
class Engineer extends Employee{
	void display()
	{
		System.out.println("Name of class is Engineer");
	}
	void calcSalary()
	{
		System.out.println("Salary of employee is 20000");
		super.display();
		super.calcSalary();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Engineer A=new Engineer();
		A.display();
		A.calcSalary();
	}

}
