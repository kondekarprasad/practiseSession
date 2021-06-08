package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sort  Employee by age (asked in Privacy 4 car)
class Privacy4Compare implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}
}

class Employee {

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Privacy4 {

	public ArrayList<Employee> employeeSorter(ArrayList<Employee> arrayList) {

		Collections.sort(arrayList, new Privacy4Compare());
		return arrayList;

	}

	public static void main(String[] args) {
		Privacy4 privacy4 = new Privacy4();
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(26, "ea"));
		arrayList.add(new Employee(16, "bb"));
		arrayList.add(new Employee(25, "af"));
		arrayList.add(new Employee(23, "fa"));
		arrayList.add(new Employee(27, "ag"));
		arrayList.add(new Employee(26, "ea"));
		// System.out.println(arrayList);
		privacy4.employeeSorter(arrayList);
		privacy4.printer(arrayList);

	}

	private void printer(ArrayList<Employee> arrayList) {
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}

	}
}
