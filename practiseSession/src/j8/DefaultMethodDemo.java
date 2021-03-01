package j8;

//we can have multiple default method with implementation in  interface
interface Interf4 {
	default void m1() {
		System.out.println("interf4 method");

	}
}
interface Interf5 {
	default void m1() {
		System.out.println("interf5 method");

	}
}
public class DefaultMethodDemo implements Interf4, Interf5 {
	public void m1() {
		System.out.println("overridden method");
		Interf5.super.m1();
		Interf4.super.m1();

	}
	
	public static void main(String[] args) {
new DefaultMethodDemo().m1();
	}
}
