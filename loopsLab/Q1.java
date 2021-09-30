package loopsLab;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner myNum = new Scanner(System.in);

	    System.out.println("Enter number");

	    // Numerical input
	    int num = myNum.nextInt();
	    
	    //For loop
		for (int i = 1; i <= num; i++) {
			System.out.print(num);
		}
		myNum.close();
	}
}
