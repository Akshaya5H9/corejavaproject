package com.siiet.Helloworld;

import java.util.Scanner;

public class ZeroorNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=s.nextInt();
		if(number==0){
			System.out.println("The number is Zero");
		}
		else {
			System.out.println("The number is not Zero");
		}
		s.close();
		}
		}


