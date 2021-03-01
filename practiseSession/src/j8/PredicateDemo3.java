package j8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	double salary;
	public Employee(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	String name;
	
	
}
public class PredicateDemo3 {

	public static void main(String[] args) {
		PredicateDemo3 demo3 = new PredicateDemo3();
		
		
							demo3.m1();
							
	}
	void m1() {
		ArrayList<Employee> arrayList= new ArrayList<Employee>();
							arrayList.add(new Employee (390934,"nag"));
							arrayList.add(new Employee (90934,"chaitnaya"));
							arrayList.add(new Employee (3909,"chiranjeevi"));
							arrayList.add(new Employee (11000,"vijay"));
							arrayList.add(new Employee (98734,"devarkonda"));
							arrayList.add(new Employee (390934,"nani"));
		Predicate<Employee> p=emp->emp.salary>90934;
		for (Employee employee : arrayList) {
			if(p.test(employee)) {
				System.out.println(employee.salary+"  "+employee.name);
			}
		}
	}
	
}
