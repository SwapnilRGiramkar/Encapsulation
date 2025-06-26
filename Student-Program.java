//Student Program using Encapsulation 
package encapsulation;

public class Student
{

	private String name;
	private int age;
	private String course;

	public Student()
	{
		// TODO Auto-generated constructor stub
	}

	Student(String name,int age,String course)
	{
		this.name=name;
		this.age=age;
		this.course=course;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public void setAge(int age )
	{
		this.age=age;
	}

	public int getAge()
	{
		return age;
	}

	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}


}
//-------------------------------------------------------
package encapsulation;

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		
		s1.setName("Swapnil");
		s1.setCourse("Computer Science");
		s1.setAge(23);
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());
		System.out.println("Course : "+s1.getCourse());
	}

}
//-------------------------------------------------------------
