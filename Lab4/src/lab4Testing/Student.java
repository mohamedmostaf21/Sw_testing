package lab4Testing;

public class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String GetName()
	{
		return this.name;
	}
	
	public int GetAge()
	{
		return this.age;
	}
	@Override
	public boolean equals(Object s)
	{
		Student s2 = (Student)s;
		return this.name == s2.GetName() && this.age == s2.GetAge();
	}
}
