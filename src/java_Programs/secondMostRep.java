package java_Programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class secondMostRep {

	public static void main(String[] args) {
		String str = "successes";
		int FirstMax = 0;
		int SecondMax = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {

				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			}

			else {

				hm.put(str.charAt(i), 1);

			}
		}

		for (Entry<Character, Integer> entry : hm.entrySet()) {

			int value = entry.getValue();

			if (value > FirstMax) {

				SecondMax = FirstMax;
				FirstMax = value;

			} else if (value > SecondMax && value != FirstMax) {

				SecondMax = value;
			}

		}

		for (Entry<Character, Integer> entry : hm.entrySet()) {

			int value = entry.getValue();

			if (value == SecondMax) {

				System.out.println(SecondMax + " " + entry.getKey());

			}

		}
	}

}
