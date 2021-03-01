package j8;


interface Interf1{
	int m1(int a);
}
class Test2
{
	public static void main(String[] args) {
		//provide business logic using lamda expression
		Interf1 m=a->a*a;
		//pass actual parameter to method
		System.out.println(m.m1(2));
	}
}
