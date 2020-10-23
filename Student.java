package studentDatabaseApp;
import java.util.Scanner;

public class Student {

	private int numOfStudents;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 for freshmen\n2 for sophomore\n3 for junior\n4 for senior\nEnter Student class year: ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
	}
	
	//Generate an Id
	private void setStudentId() {
		//grade level + ID
		id++;
		this.studentId = gradeYear + "" + + id;
	}
	
	
	//Enroll in courses
	public void enroll() {
		//get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break; }
		} while(1 != 0);
			System.out.println("ENROLLED IN: " + courses);
			System.out.println("TUITION BALANCE: " + tuitionBalance);
		}
	
		
		
	
	
	//View balance
	
	//pay tuition
	
	//Show status
}