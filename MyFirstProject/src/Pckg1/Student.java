package Pckg1;

public class Student {
	int age, roll;
	public void display()
	{
		System.out.println("age is:");
		
	}
	public void display1()
	{
		System.out.println("roll is:");
		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.age =3;
		s.roll = 10;
		System.out.println(s.age);
		System.out.println(s.roll);
		}

}
