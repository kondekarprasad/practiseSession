package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<String>();
					name.add("cgh");
					name.add("abd");
					name.add("dsl");
					name.add("as");
					name.add("bdfb");
					name.add("cgh");
		HashSet<String> set1 = new HashSet<String>();
		for (int counter = 0; counter < name.size(); counter++) {
			set1.add(name.get(counter));

		}
/*		for (String string : set1) {
			System.out.println(string);

		}*/
		System.out.println(set1);

	}

}
