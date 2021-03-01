package j8;

@FunctionalInterface
interface Interf {
	public void m1(int a, int b);
}
//@FunctionalInterface //this annotation is optional
interface Interf2 {
	public void m2(int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		Interf x = (int a, int b) -> System.out.println(a + b);
		Interf y = (int a, int b) -> System.out.println(a * b);
		Interf z = (int a, int b) -> System.out.println(a - b);

		x.m1(10, 20);
		x.m1(10, 25);
		y.m1(10, 12);
		z.m1(83, 12);
		System.out.println("====================================");
		Interf2 x2 = (b) -> System.out.println("hi  "+b);
		Interf2 y2 = (b) -> System.out.println(Math.sqrt(b));
/*		x2.m2(11);
		y2.m2(20);
*/
	}

}
