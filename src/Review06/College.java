package Review06;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		
		stu.name="John";
		stu.lastName="Doe";
		stu.address="New York";
		stu.studentID=199;
		stu.age=45;
		stu.grade='B';
		
		//void methods, simply accessing them
		stu.study();
		stu.doHomework();
		
		//below 2 methods 
		System.out.println(stu.getFullName());
		String rating=stu.rating();
		System.out.println(stu.name+" is "+rating+" student");
		
		

	}

}
