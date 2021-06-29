package com.practice;

public class Smoke_test {
	//log in
void getLogin(){
	System.out.println("non static method");
		
	}
 static void getLogin1(){
	System.out.println("static method");
		
	}
public static void main(String[] args) {
	System.out.println("Log in tests");
	Smoke_test obj = new Smoke_test();
	obj.getLogin();
	getLogin1();
	Smoke_test.getLogin1();
	
	
}

}
