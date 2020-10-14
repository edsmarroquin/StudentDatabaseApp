package studentDatabaseApp;
import java.util.Scanner;

public class Student {

	private int numOfStudents;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentId;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	
	//constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 for freshmen\n2 for sophomore\n3 for junior\n4 for senior\nEnter Student class year: ");
		this.gradeYear = in.nextInt();
		
		
		
	}
	
	//Generate an Id
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId() {
		this.studentId = studentId;
	}
	
	
	//Enroll in courses
	
	//View balance
	
	//pay tuition
	
	//Show status
}