package j8;

import java.util.function.Function;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Student {
	int marks;
	String name;

	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
}

public class FunctionDemo {
	private void m1() {
		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "Distinction";
			else if (marks >= 60)
				grade = "Distinction";
			else if (marks >= 50)
				grade = "C grade";
			else if (marks >= 35)
				grade = "D grade";
			else
				grade = "fail";

			return grade;
		};
		Student[] s = { new Student(100, "nag"), new Student(70, "chaitnya"), new Student(62, "vijay"),
				new Student(30, "vikki"), new Student(50, "rikni") };
		for (Student student : s) {

			System.out.println(student.name);
			System.out.println(student.marks);
			  System.out.println(f.apply(student));
			  System.out.println();
			 

		}

	}

	public static void main(String[] args) {
		FunctionDemo demo = new FunctionDemo();
		demo.m1();

	}

}
