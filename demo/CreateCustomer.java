package demo;

import java.util.*;

public class CreateCustomer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Customer #1
		System.out.println("Enter customer 1:");
		String name1 = scan.next();
		System.out.println("Enter customer 1 email address:");
		String email1 = scan.next();
		System.out.println("Enter customer 1 address:");
		String address1 = scan.nextLine();
		scan.next();

		// Customer #2
		System.out.println("Enter customer 2:");
		String name2 = scan.next();
		System.out.println("Enter customer 2 email address:");
		String email2 = scan.next();
		System.out.println("Enter customer 2 address:");
		String address2 = scan.nextLine();
		scan.nextLine();


		// Customer #3
		System.out.println("Enter customer 3:");
		String name3 = scan.next();
		System.out.println("Enter customer 3 email address:");
		String email3 = scan.next();
		System.out.println("Enter customer 3 address:");
		String address3 = scan.nextLine();
		scan.next();

		Customer c1 = new Customer();

		c1.setName(name1);
		c1.setEmail(email1);
		c1.setAddress(address1);

		c1.display();
		
		Customer c2 = new Customer();

		c2.setName(name2);
		c2.setEmail(email2);
		c2.setAddress(address2);

		c2.display();

		Customer c3 = new Customer();

		c3.setName(name3);
		c3.setEmail(email3);
		c3.setAddress(address3);
		
		c3.display();

		
		scan.close();

	}
}
