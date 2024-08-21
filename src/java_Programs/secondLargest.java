package java_Programs;

public class secondLargest {

	public static void main(String[] args) {
		int[] array = { 10, 20, 4, 45, 99, 6, 85, 87 };

		if (array.length < 2) {
			System.out.println("Array should have at least two elements");
		}

		else {
			int firstLargest = 0;
			int secondLargest = 0;
			for (int num : array) {
				if (num > firstLargest) {
					secondLargest = firstLargest;
					firstLargest = num;

				} else if (num > secondLargest && num != firstLargest) {

					secondLargest = num;

				}

			}

			System.out.println(secondLargest);
			System.out.println(firstLargest);

		}
	}

}
