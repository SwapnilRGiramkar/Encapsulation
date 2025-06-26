//we achieved encapslation using Employee class.
package encapsulation;

public class Employee 
{
	private int empid;
	private double salary;
	private long adhar;
	private String email;
	private long mob;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Employee(int empid,double salary,long adhar)
	{
		this.empid=empid;
		this.salary=salary;
		 this.adhar=adhar;
		//this.email=email;
		//this.mob=mob;
	}
	public int getEmpid()
	{
		return empid;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public void setMobile(long mob)
	{
		this.mob=mob;
	}
	
	public long getAdhar()
	{
		return adhar;
	}
	
	public  double getSalary()
	{
		return salary;
	}
	
	public long getMobile()
	{
		return mob;
	}
	
}
//-------------------------------------------------------------------------
package encapsulation;

public class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee(101,456.0,658228890136l);
		
		System.out.println("Adhar Number :"+e1.getAdhar());
		System.out.println("Employee id : "+e1.getEmpid());
		System.out.println("Salary is : "+e1.getSalary());
		System.out.println("--------------------------------");
		
		e1.setMobile(9284094059l);
		e1.setEmail("swapnil@123");
		
		System.out.println("Email : "+e1.getEmail());
		System.out.println("Mobile : "+e1.getMobile());
	}
}
//-----------------------------------------------------------------------
