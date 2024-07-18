package com.siiet.Helloworld;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int number=s.nextInt();
	if(number % 2==0){
		System.out.println("The number is even");
	}
	else {
		System.out.println("The number is odd");
	}
	s.close();
	}
	}


