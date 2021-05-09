package j8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDuplicateStringInArray {

	public static void main(String[] args) {
		String str = "i am java i am erwin";
		List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
				.collect(Collectors.toList());
		Map<String, Integer> wordCounterMap = list.stream()
				.collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
		System.out.println(wordCounterMap);

	}

}
