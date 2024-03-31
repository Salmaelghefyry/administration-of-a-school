package main;

import java.util.Scanner;

import models.Person;
import models.School;
import models.Student;
import services.SchoolServices;
import models.Teacher;
public class Hmi {
	private static SchoolServices schoolservices;
	
	public static void start() {
		Scanner scanner = new Scanner(System.in);
		School school=Hmi.createSchool();
		
		System.out.println("Welcome to "+school.getName());
	    String action;
		
		do {
			System.out.println("\nHi!! sir/lady , what do you want to do? \n 1.add a student \n 2.Print all the Students\n 3.add a teacher\n 4.print all the teachers\n 5.Find a person by its name ");
			action=scanner.next();
			switch (action) {
			case "1" : Hmi.addStudent();
			           break;
			           
			case "2" : Hmi.PrintAllStudent();
			           break;
			case "3" : Hmi.addTeacher();
			           break ;
			case "4" :Hmi.printallteachers();
			          break ;
			case "5" :System.out.println("looking for a student : enter 1, for a teacher :enter 2");
				Scanner reader=new Scanner(System.in);
			          int a=reader.nextInt();
			          Hmi.findPersonByname(a);
			          break;
			}
		}while(!action.equals("exit"));
	}
	
	private static School createSchool() {
		School school=new School();
		school.setName("WAY TO SUCCESS");
		school.setAdress(",MOROCCO");
		school.setPhoneNumber("05...");
		Hmi.schoolservices=new SchoolServices(school);
		return school;
	}
	
	private static void addStudent() {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
        System.out.println("Please enter the student's name");
        student.setName(scanner.next());
        System.out.println("Please enter the student's age");
        student.setAge(scanner.nextInt());
        System.out.println("Please enter the student's parent phone number");
        student.setParentPhoneNumber(scanner.next());
        Hmi.schoolservices.addStudent(student);
	}
	
	private static void PrintAllStudent() {
		for(Student student: Hmi.schoolservices.getSchool().getStudents()) {
		       System.out.println(student.getName()+"\t"+student.getAge());
	    }
		
	}
	private static  void addTeacher() {
		Scanner scanner = new Scanner(System.in);
		Teacher teacher = new Teacher();
        System.out.println("Please enter the teacher's name");
        teacher.setName(scanner.next());
        System.out.println("Please enter the teacher's age");
        teacher.setAge(scanner.nextInt());
        System.out.println("Please enter the salary");
        teacher.setSalary(scanner.nextFloat());
        Hmi.schoolservices.addTeacher(teacher);
	}
	private static void printallteachers() {
		for (Teacher teacher :Hmi.schoolservices.getSchool().getTeachers()) {
			System.out.println(teacher.getName()+"\t"+teacher.getAge());
		}
	}
// this function is used to look for a teacher or a student not to make repetition 
	private static void findPersonByname(int action) {
		Scanner reader =new Scanner (System.in);
		System.out.println("plz enter the name ");
		String name =reader.nextLine();
		Person p;
		if (action==1) {
			p=Hmi.schoolservices.getStudentByName(name);
		}else {
			p=Hmi.schoolservices.getTeacherByName(name);
		}
		if(p == null) {
			System.out.println("Not found");
		}else 
		System.out.println(p.getName()+"\t"+p.getAge());
	}		
	}
