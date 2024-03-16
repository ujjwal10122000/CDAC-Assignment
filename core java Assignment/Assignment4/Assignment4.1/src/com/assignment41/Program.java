package com.assignment41;

import java.util.Scanner;

class Student {
	private String name;
	private int Rollnum;
	private float cgpa;

	public void takedata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:-	");
		this.name = sc.nextLine();
		System.out.print("Enter RollNumber:-	");
		this.Rollnum = sc.nextInt();
		System.out.print("Enter CGPA:-	");
		this.cgpa = sc.nextFloat();
		

	}

	public void printdata() {
		System.out.println("Student name:-  " + name);
		System.out.println("Student Rollnumber :-  " + name);
		System.out.println("Student marks in CGPA:-  " + name);
	}
}

public class Program {
	private static Scanner ser = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Print Record.");
		System.out.print("Enter choice	:	");
		return ser.nextInt();
				}
	
	public static void main(String args[]) {
		Student std = new Student();
	
		
		int a;
		while ((a=Program.menuList())!= 0) {
			switch( a ) {
			case 1:
				std.takedata();
				break;
			case 2:
				std.printdata();
				break;
			}
			
			
			
				
			}
		}
	

}
