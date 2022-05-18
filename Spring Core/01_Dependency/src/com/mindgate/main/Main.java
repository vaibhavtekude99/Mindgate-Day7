package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {

	
	public static void main(String[] args) 
	{
	
		Address address=new Address(166, "Road", "Ahmednagar","Maharastra");
		Employee employee=new Employee(1,"vaibhav",30000, address);
		
		System.out.println(employee);
	}
}
