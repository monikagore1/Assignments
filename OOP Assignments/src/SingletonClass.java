// 1. singleton class example
class Student
{
	 static Student st=new Student();
	
	private Student()
	{
		System.out.println("sinleton class example");
	}
	 static Student getInstance()
	{
		
		return st;
	
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		
		Student st1=Student.getInstance();
		//Student st2=Student.getInstance();
		//Student st3=Student.getInstance();

	}

}
