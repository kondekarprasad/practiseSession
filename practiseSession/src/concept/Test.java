package concept;

class Test 
{
	static int i=20;
	static{
		m1();
		System.out.println("first static block executed");
	}
	public static void main(String[] args) 
	{   
		m1();
		System.out.println("Hello World!");
	}
	public static void m1()
	{
		System.out.println(j);
	}
	static {
		System.out.println("second static block executed");
	}
	static int j=10;
}
