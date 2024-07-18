package com.siiet.staticexample;

public class Student {
	int rollno;
	String name;
	static String college="siiet";
	static void change() {
		college="sreyas";
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	
	}
	
	}
	
	


