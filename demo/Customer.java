package demo;

public class Customer {
	private String name;
	static int id;
	static long invoice;
	public String birthday;
	private String address;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer() {
		++id;
		invoice = System.currentTimeMillis();
	}

	public void display() {
		System.out.println();
		System.out.println("Customer # " + Customer.id);
		System.out.println("Invoice # " + Customer.invoice);
		System.out.println("=======================================");
		System.out.println("Name: " + this.name);
		System.out.println("Email Address: " + this.email);
		System.out.println("Address: " + this.address);
		System.out.println("=======================================");
		System.out.println();

	}
}
