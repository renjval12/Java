package arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int[] averageArr = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < averageArr.length; i++) {
			sum += averageArr[i];
		}
		int average = sum / averageArr.length;
		System.out.println("Average of 1, 2, 3, 4, 5 = " + average);
	}

}
