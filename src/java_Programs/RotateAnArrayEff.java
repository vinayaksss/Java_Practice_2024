package java_Programs;

import java.util.Arrays;

public class RotateAnArrayEff {

static void reverse(int a[], int start, int end) {

		while (start < end) {

			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;

		}
//System.out.println("Rer"+Arrays.toString(a));
	}

	static void rotate(int a[], int k) {
		k = k % a.length;
			if (k < 0) {
				
			k = k + a.length;
				
		}

		reverse(a, 0, k - 1);
		reverse(a, k, a.length - 1);
		reverse(a, 0, a.length - 1);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5,6 };
		
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}
		System.out.println();

		rotate(a, 2);
		
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

}
