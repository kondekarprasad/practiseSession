package j8;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		PredicateDemo2 demo2 = new PredicateDemo2();
		demo2.m1();
	}

	private void m1() {
		// here we r not declaring type for reference variable str
		Predicate<String> p = str -> str.length() > 5;
		String[] strArr = { "nag", "chaitnaya", "chiranjeevi", "vijay", "devarkonda", "prabhas" };
		for (String string : strArr) {
			if (p.test(string)) {
				System.out.println(string);
			}

		}

	}

}
