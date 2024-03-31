package models;

import java.util.ArrayList;

public class School {
	
	String name ;
	String adresse ;
	String phoneNumber;
	ArrayList<Student> students ;
	ArrayList<Teacher> teachers ;
	ArrayList<Grade> grades;
	public School(){
		this.students=new ArrayList<Student>();
		this.teachers= new ArrayList<Teacher>();
		this.grades=new ArrayList<Grade>();
	}
    public School(String name){
    	this.name=name;
    	this.students=new ArrayList<Student>();
		this.teachers= new ArrayList<Teacher>();
		this.grades=new ArrayList<Grade>();
	}
    public String getName() {
    	return name;
    }
    public void setName(String name ) {
    	this.name=name;
    }
    public String getAdresse() {
    	return adresse ;
    }
    public void setAdress(String adresse) {
    	this.adresse=adresse;
    }
    public String getPhoneNumber() {
    	return phoneNumber; 
    }
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber=phoneNumber;
    }
    public ArrayList<Student> getStudents(){
		return students;
	}
	
	public ArrayList<Teacher> getTeachers(){
		return teachers;
	}
	
	public ArrayList<Grade> getGrades() {
		return grades;
		
	}
  
}
