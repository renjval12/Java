package OOP;

public class Person {
	// ===== WHAT IS A CLASS? =====
	// • Template/blueprint to create an object

	// ===== HOW DO WE DEFINE OBJECT? =====
	// • Characteristics of object: every object has a state/properties and methods
	// • State is a characteristic of an object
	// • Method is a variable of an object

	// ===== HOW DO WE DEFINE A METHOD? =====
	// • Consist of business logic which consists of one purpose/task

	// ===== SIDE NOTES =====
	// Not every class needs to be instantiated.
	// Not all classes will have methods and variables.

	// Instance variables: these are not similar to your local variables
	// It's not best practice to put default values.
	String pprofession;
	String pfname;
	String plname;
	int page;
	char pgender;
	double psalary;

	// Creating empty constructor - this is constructing an object.
	// Compiler can create an empty constructor for us if we don't create it.
	// This is called Constructor overloading. To test this out comment out the
	// public Person() and the public Person(parameters...)
	// HOT TIP FOR INTERVIEW: If you are creating parameterized constructor WE HAVE
	// TO CREATE an empty constuctor. If we don't need to create parametized
	// constructor, we can omit writing the both of them.
	public Person() {

	}

	// Creating parameterized constructor
	// Why would we need to create parameterized constructor? Let's say we have many
	// instance variables. This way we can pass on only the variables we want to
	// associate with this specific constructor.
	// And yes, we have can have multiple constructors.
	public Person(String profession, String fname, String lname, int age, char gender, double salary) {
		pprofession = profession;
		pfname = fname;
		plname = lname;
		page = age;
		pgender = gender;
		psalary = salary;
	}

	// Instance method or non-static method - needs to be invoked with object
	// references. If you invoke this without object reference you will get compiler
	// error. For example p1.display() is what you would need and display() will get
	// an error.
	void display() {
		System.out.println("Profession: " + this.pprofession);
		System.out.println("First Name: " + this.pfname);
		System.out.println("Last Name: " + this.plname);
		System.out.println("Age: " + this.page);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Salary: " + this.psalary);
	}

	// Static can be called without object references
	// This is a class method.
	// REMEMBER: void just means our method is not returning anything
	static void info() {
		System.out.println("Information about person class...");
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		info();

		// Calling constructor
		Person p1 = new Person();
		p1.pprofession = "Software Engineer"; // String
		p1.pfname = "Renee"; // String
		p1.plname = "Valentine"; // String
		p1.page = 1; // integer
		p1.pgender = 'N'; // char
		p1.psalary = 70000; // double

		p1.display();

		System.out.println("----------------");

		Person p2 = new Person();
		p2.pprofession = "Teacher"; // String
		p2.pfname = "Alexa"; // String
		p2.plname = "Amazon"; // String
		p2.page = 30; // integer
		p2.pgender = 'F'; // char
		p2.psalary = 60000; // double

		p2.display();

		// You can create as many objects as you want. We are creating instantiations of
		// Person Class. Each person will have different values.
	}

}