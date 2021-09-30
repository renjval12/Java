package loopsLab;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner myNum = new Scanner(System.in);
		int i = 1;
		System.out.println("Enter number");
		// Numerical input
		int num = myNum.nextInt();
		while (i <= num) {
			i += i;
		}
		System.out.println(i);
		myNum.close();

//		while (i <= 20) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
	}

}
