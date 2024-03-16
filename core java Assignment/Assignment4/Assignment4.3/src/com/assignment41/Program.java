package com.assignment41;
class Employee{

public void personalData(String name,double phonenumber,int age) {
	System.out.println("name of Employee:  "+name);
	System.out.println("mobile number od Employee :  "+phonenumber);
	System.out.println("age of Employee:  "+age);
		
	}
public void personalData(String name,int age,double phonenumber) {
	System.out.println("name of Employee:  "+name);
	System.out.println("mobile number od Employee :  "+phonenumber);
	System.out.println("age of Employee:  "+age);
}
public void companyData(String deg,int salary) {
	System.out.println("designation of Employee:  "+deg);
	System.out.println("salary of Employee:  "+salary);
}
public void companyData(int salary , String deg) {
	System.out.println("designation of Employee:  "+deg);
	System.out.println("salary of Employee:  "+salary);
	
}

}

public class Program{
	
	public static void main(String args[]) {
		Employee em=new Employee();
		System.out.println("personal data method calling 1st time----------");
		em.personalData("ujjwal",7389795087d,23);
	
		System.out.println("company data methos calling 1st time----------");
		em.companyData("developer",45000);
	
		System.out.println("personal data methos calling 2st time----------");
		em.personalData("tejas",22,63598745623d);
	
		System.out.println("company data methos calling 2st time----------");
		em.companyData(45000,"developer");
		
		
		
		
	}
}