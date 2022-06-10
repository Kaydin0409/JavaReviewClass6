package Review06;

public class Student {

	//define attributes/fields=variables/properties
	
	String name, lastName, address;
	
	int studentID, age;
	
	char grade;
	
	// define behavior = methods
	
	void study() {
		System.out.println(name+" student is studying");
	}
	
	void doHomework() {
		System.out.println(name+" student is doing homework");
	}

	//this is template but not executable WIHOUT main method.  Main method is an entrance for programming
		
	/*
	 * Create a method that will return full name of
	 * student in upper case
	 */
	
	String getFullName(){
		return name.toUpperCase()+" "+lastName.toUpperCase();
	}
	
	/*
	 * Create a method that will return whether student
	 * is great, good, bad, or average
	 * based on the grade
	 */
	
	String rating() {
		switch(grade) {
		case 'A':
			return "great";
		case 'B':
			return "good";
		case 'C':
			return "average";
		default:
			return "bad";
		}
	}
		
	void takeSubject(String subject) {
		System.out.println(name+" studies "+subject);
	}
		
		
		

	}


