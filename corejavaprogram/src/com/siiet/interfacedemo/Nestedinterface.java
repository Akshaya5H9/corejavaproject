package com.siiet.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface{
	public void print() {
		System.out.println("innerinterface");
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Nestedinterface.id);
		
	}
	}
	


