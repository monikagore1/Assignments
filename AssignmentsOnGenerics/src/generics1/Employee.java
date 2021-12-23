package generics1;

public class Employee {
	private int empid;
	private String empname;
	private double empsalary;
	private String empdepartment;
	
	public Employee(int empid, String empname, double empsalary, String department)
	{
		super();
		this.setEmpid(empid);
		this.setEmpname(empname);
		this.setEmpsalary(empsalary);
		this.setEmpdepartment(department);
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	
	public String getEmpdepartment() {
		return empdepartment;
	}

	public void setEmpdepartment(String empdepartment) {
		this.empdepartment = empdepartment;
	}
	public void display()
	{
		System.out.println("empid :"+getEmpid()+" emp name:"+getEmpname()+"emp salary:"+getEmpsalary()+"emp department:"+getEmpdepartment());
	}

	
	

}
