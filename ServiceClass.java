package com.gl.servic;

import java.util.Random;

import com.gl.support.pojo.Employee;

public class ServiceClass {

public String generateEmail(Employee emp,String departmentName){
	
return emp.getFirstName()+emp.getLastName()+"."+departmentName+"@"+"abc.com";
	}
	 public char[] generatePassword() {
		 String capitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String smallLetter="abcdeghijklmnopqrstuvwxyz";	
		 String number="012356789";
		 String special="!@#$%&*+?:";
		 String value=capitalLetter+smallLetter+number+special;
		 Random random= new Random();
		 char[] password=new char[8];
		 for(int i=0;i<8;i++)
		 {
			password[i]= value.charAt(random.nextInt(value.length())) ;
		 }
		return password;
	}
	public void showCredentials(Employee emp,String departmentName) {
		System.out.println("Dear "+ emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email---->"+generateEmail(emp,departmentName));
		System.out.print("Password --->");
		System.out.print(generatePassword());
	}
}
