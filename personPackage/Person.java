package personPackage;

public class Person {

	String firstName;
	String lastName;
	String fullName;
	int age;
	char gender;
	String occupation;
	String city;
	String state;
	String country;
	double salary;

	public Person() {

	}

	public Person(String firstName, String lastName, int age, char gender, String occupation, String city, String state,
			String country, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.salary = salary;

	}

	void display() {
		System.out.println("Full Name: " + this.fullName);
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
		System.out.println("Occupation: " + this.occupation);
		System.out.println("Location: "+ displayLocation());

	}

	String displayLocation() {
		String location = this.city + ", " + this.state + ", " + this.country;
		return location;
	}

	static void info() {
		System.out.println("Information about person class...");
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		info();

		// Calling constructor
		Person p1 = new Person();

		p1.firstName = "John";
		p1.lastName = "Smith";
		p1.age = 20;
		p1.gender = 'M'; // note the single quotes
		p1.city = "New York"; // note the single quotes
		p1.state = "New York"; // note the single quotes
		p1.country = "US"; // note the single quotes
		p1.occupation = "Software Engineer";

		p1.display();

		System.out.println("----------------");
		System.out.println();
		System.out.println("Other Details");

		p1.displayLocation();

		System.out.println("----------------");

		

	}

}
