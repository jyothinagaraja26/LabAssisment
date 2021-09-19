package com.gl.main;

import java.util.Scanner;

import com.gl.servic.ServiceClass;
import com.gl.support.pojo.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
      Employee emp=new Employee("Jyothi","nagaraja");
      ServiceClass service=new ServiceClass();
      Scanner sc=new Scanner(System.in) ;    
      System.out.println("please enter the departement name");
   
     System.out.println("1.Technical");
     System.out.println("2.Admin");
     System.out.println("3.HR");
     System.out.println("4.Legal");
     int value=sc.nextInt();
     switch(value) {
     case 1:
    	 service.showCredentials(emp,"Tech");
    	 break;
     case 2:
    	 service.showCredentials(emp,"Admin");
    	 break;
     case 3:
    	 service.showCredentials(emp,"Hr");
    	 break;
     case 4:
    	 service.showCredentials(emp,"Legal");
    	 break;
    	 default:
    		 System.out.println("Enter the correct number");
    		 break;
    		    }
	}
	
}
