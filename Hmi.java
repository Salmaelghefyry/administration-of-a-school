package main;

import java.util.Scanner;

import models.School;
import models.Student;
import services.SchoolServices;

public class Hmi {
	public static void start() {
		Scanner scanner=new Scanner(System.in);
		
		School school=new School() ;
		SchoolServices schoolServices=new SchoolServices(school);
		school.setName("brilliant future");
		school.setAdress("Estonia");
		school.setPhoneNumber("0523453671");
		
		System.out.println("welcome to "+school.getName());
		String action ;
		
		do {
			System.out.println("what is your choice");
			Scanner read= new Scanner(System.in);
			action=read.nextLine();
			
			if (action.equals("addStudent")) {
				Student student =new Student();
				System.out.println(" enter the name");
				student.setName(read.nextLine());
				System.out.println(" enter the age");
				student.setAge(read.nextInt());
				System.out.println(" enter the Phone number ");
				student.setParentPhoneNumber(read.nextLine());
				schoolServices.addStudent(student);
			}if(action.equals("printAllstudent")) {
				for(Student student :school.getStudents()) {
					System.out.println(student.getName());
				}
			}
		}while(!action.equals("exit"));
	}
}

