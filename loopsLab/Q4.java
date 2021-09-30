package loopsLab;

public class Q4 {
	public static void main(String[] args) {
//		String even = '';
//		String odd = 
//		
//		
//		for (int i = 1; i <= 10; i++) {
//
//			if (i % 2 != 0) {
//				if (i < 10) {
//					System.out.print(i + ",");
//				}
//				System.out.print(i);
//			} else {
//				if (i < 10) {
//					System.out.print(i + ",");
//				} else {
//					System.out.print(i);
//				}
//			}
//
//		}
//
////		System.out.println();
////
////		for (int i = 1; i <= 10; i++) {
////			if (i % 2 == 0) {
////				if (i < 10) {
////					System.out.print(i + ",");
////				} else {
////					System.out.print(i);
////				}
////			}
////
////		}

		String even = "";
		String odd = "";

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				if (i < 10) {
					even += i + ", ";
				} else {
					even += i;
				}
			} else {
				odd += i + (i < 9 ? ", " : "");
			}

		}
		System.out.println(odd);
		System.out.println(even);


	}
}
