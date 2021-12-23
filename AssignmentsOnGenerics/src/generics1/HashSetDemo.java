package generics1;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Employee> hashSet=new HashSet<Employee>();
		
		Employee emp1=new Employee(101,"abc",1200,"dept1");
		Employee emp2=new Employee(102,"xyz",1500,"dept2");
		Employee emp3=new Employee(103,"pqr",1800,"dept3");
		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);
		
		for(Employee emp:hashSet)
		{
			emp.display();
		}

	}

}
