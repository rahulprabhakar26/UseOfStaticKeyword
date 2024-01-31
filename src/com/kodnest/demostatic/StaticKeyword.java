package com.kodnest.demostatic;

public class StaticKeyword {
	public static void main(String[] args) {
		Aadhar a1=new Aadhar("Rahul" , 20);
		Aadhar a2=new Aadhar("Prabhakar",10);
		Aadhar a3=new Aadhar("Anand", 23);
		Aadhar a4=new Aadhar("Sachin", 24);
		Aadhar a5=new Aadhar("ujawal" ,45);
		
		System.out.println(a1.age+"-"+a1.name +"-"+a1.nationality);
		System.out.println(a2.age+"-"+a2.name +"-"+Aadhar.nationality);
		System.out.println(a3.age+"-"+a3.name +"-"+a3.nationality);
		
	
		
	}

}


class Aadhar{
	
	public Aadhar(String name , int age) {
		this.name=name;
		this.age=age;
		
	}
	static String nationality ="Indian";
	String name;
	int age;
	
}
