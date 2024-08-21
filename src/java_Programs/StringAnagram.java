package java_Programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		int a=121;
		int b[]= {};
		//String c1="123";
		String s11=String.valueOf(a);

		//int n1=Integer.parseInt(c1);
		
		String s1="listen";
		String s2="silent";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));
		
		
	}

}
