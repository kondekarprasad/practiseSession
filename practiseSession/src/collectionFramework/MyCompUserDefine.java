package collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class MyCompUserDefine {

	public static void main(String a[]) {
	

		// By using salary comparator (int comparison)
		TreeSet<Employee> salComp = new TreeSet<Employee>(new MySalaryComp());
		salComp.add(new Employee(13, "Ram"));
		salComp.add(new Employee(15, "John"));
		salComp.add(new Employee(17, "Crish"));
		salComp.add(new Employee(20, "Tom"));
		for (Employee e : salComp) {
			System.out.println(e);
		}
	}
}

class MySalaryComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getAge() > e2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}
}
