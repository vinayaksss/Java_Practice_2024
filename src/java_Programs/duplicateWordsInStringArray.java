package java_Programs;

import java.util.Arrays;

public class duplicateWordsInStringArray {

public static void main(String[] args) {
		
String str[]= {"C++","java","Python","java"};
String[] uniqueArray = Arrays.stream(str)
.distinct()
.toArray(String[]::new);

System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));


	}

}
