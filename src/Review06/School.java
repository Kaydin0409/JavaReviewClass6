package Review06;

public class School {
	
	public static void main(String[] args) {
		
		new Student();
		/*
		 * object has been created BUT
		 * no variable has been assigned
		 */
		
		Student student1=new Student();
		//object has been created WITH a variable
		//object of STUDENT type.
		//Access to all variables and all methods of Student
		
		student1.name="Samira";
		student1.lastName="Pashayeva";
		student1.address="Virginia";
		student1.studentID=101;
		student1.age=25;
		student1.grade='A';
		
		/*student1.subject="Java";
		 * compiler error because subject
		 * is not a variable in Student class.
		 * Object will have same variables attributes
		 * and methods as the class
		 */
		
		Student student2=new Student();
		
		//accessing variables of Student class
		student2.name="Omid";
		student2.lastName="Mahmoodi";
		student2.address="California";
		student2.age=18;
		student2.studentID=102;
		student2.grade='A';
		//now accessing methods of Student class below:
		student2.study();
		student2.doHomework();
		String fullName2=student2.getFullName();
		System.out.println(fullName2);
		
		System.out.println("----------");
		
		student1.study();
		student1.doHomework();
		String fullName=student1.getFullName();
		System.out.println(fullName);
		
		student1.takeSubject("biology");
		student2.takeSubject("Java");
		
				
		
		
		
		
		
		
		
	}
	

}
