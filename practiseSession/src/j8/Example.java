package j8;

import java.util.ArrayList;
import java.util.List;
class Employees {
	   String name; 
	   int age; 
	   int id; 
	   public String getName() {
	      return name; 
	   } 
	   public int getAge() { 
	      return age; 
	   } 
	   public int getId() { 
	      return id; 
	   } 
	   Employees(String n, int a, int i){ 
	      name = n; 
	      age = a; 
	      id = i; 
	   } 
	   @Override public String toString() {     
	      return ("Name:"+this.getName()+             
	              " Age: "+ this.getAge() +                     
	              " Id: "+ this.getId()); 
	   }
	}
public class Example {
	public static void main(String[] args) {
	      List<Employees> employeeList = new ArrayList<Employees>();
	      employeeList.add(new Employees("Jon", 22, 1001)); 
	      employeeList.add(new Employees("Steve", 19, 1003)); 
	      employeeList.add(new Employees("Kevin", 23, 1005)); 
	      employeeList.add(new Employees("Ron", 20, 1010)); 
	      employeeList.add(new Employees("Lucy", 18, 1111));
	      System.out.println("Before Sorting the employee data:"); 
	 
	      //java 8 forEach for printing the list 
	      employeeList.forEach((s)->System.out.println(s));

	      System.out.println("After Sorting the employee data by Age:"); 

	      //Lambda expression for sorting by age 
	      employeeList.sort((Employees e1, Employees e2)->e1.getAge()-e2.getAge()); 

	      //java 8 forEach for printing the list
	      employeeList.forEach((s)->System.out.println(s));         

	      System.out.println("After Sorting the employee data by Name:"); 
	      //Lambda expression for sorting the list by employee name       
	      employeeList.sort((Employees e1, Employees e2)->e1.getName().compareTo(e2.getName())); 
	      employeeList.forEach((s)->System.out.println(s));        
	      System.out.println("After Sorting the employee data by Id:");        
	      //Lambda expression for sorting the list by employee id 
	      employeeList.sort((Employees e1, Employees e2)->e1.getId()-e2.getId()); 
	      employeeList.forEach((s)->System.out.println(s)); 
	}


}
