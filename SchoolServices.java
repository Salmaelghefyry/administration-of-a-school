package services;

import models.Grade;
import models.School;
import models.Student;
import models.Teacher;

public class SchoolServices {
	School school ;
	public SchoolServices(School school) {
		this.school=school;
	}
	
	public School getSchoo() {
		return school;
	}
	
	// to add a new student to the list 
	public void addStudent(Student student) {
		this.school.getStudents().add(student);
	}
	// to add a new teacher to the list 
	public void addTeacher(Teacher teacher ) {
		this.school.getTeachers().add(teacher);
	}
	
	// to add a new grade to the list 
	public void addGrade(Grade grade) {
		this.school.getGrades().add(grade);
	}
	
	// to delete a student or a teacher or a grade from a list
	public void removeStudent(Student student ) {
		this.school.getStudents().remove(student )	;
	}
	public void removeTeacher(Teacher teacher ) {
		this.school.getTeachers().remove(teacher )	;
	}
	public void removeGrade(Grade grade) {
		this.school.getGrades().remove(grade);
	}
	//to get informations of a student or a teacher or a grade by name
	
	public Student getStudentByName(String name) {
		for (Student student :this.school.getStudents()) {
			if (student.getName().equals(name)) {
				return student ;
			}
		}
		System.out.println("this student's name doesn't exist");
		return null;
	}
	
	
	public Teacher getTeacherByName(String name) {
		for (Teacher teacher :this.school.getTeachers()) {
			if (teacher.getName().equals(name)) {
				return teacher ;
			}
		}
		System.out.println("this teacher's name doesn't exist");
		return null;
	}
	
	
	public Grade getGradeByName(String name) {
		for (Grade grade :this.school.getGrades()) {
			if (grade.getName().equals(name)) {
				return grade ;
			}
		}
		System.out.println("this grade doesn't exist");
		return null;
	}
	
	
	

}
