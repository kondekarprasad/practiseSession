package j8;

import java.util.function.Predicate;

public class PredicateDemo1 {
	Predicate<Integer> p = i -> i % 2 == 0;
	Predicate<Integer> p2 = i -> i > 5;

	void m1() {
		System.out.println(p.test(10));
	}

	// and()
	void m2() {
		System.out.println(p.and(p2).test(10));
	}
	private void m3() {
		System.out.println(p.negate().test(10));
		
	}

	public static void main(String[] args) {
		PredicateDemo1 predicateDemo = new PredicateDemo1();
					  predicateDemo.m1();
			   		  predicateDemo.m2();
					  predicateDemo.m3();
		

	}

	

}
