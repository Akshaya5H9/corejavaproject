package com.siiet.Helloworld;

	public class NestedInterface implements MyInterface.MyinnerInterface{
		public void print() {
			System.out.println("innerinterface");
		}
		public static void main(String[] args) {
			NestedInterface n=new NestedInterface();
			n.print();
			System.out.println(NestedInterface.id);
			
		}
		}
		


