package com.assignment41;
class Vehical{
;
public void nexon(String name,String company,float mileage) {
	System.out.println("name of car:  "+name);
	System.out.println("company of car:  "+company);
	System.out.println("mileage of car:  "+mileage);
		
	}
public void nexon(String name,float mileage,String company) {
	System.out.println("name of car:  "+name);
	System.out.println("company of car:  "+company);
	System.out.println("mileage of car:  "+mileage);
}
}

public class Program{
	
	public static void main(String args[]) {
		Vehical vh=new Vehical();
		vh.nexon("nexon","tata",20.2f);
		System.out.println("2nd time method calling__________");
		vh.nexon("nexon",20.2f,"tata");
		
		
	}
}