package com.mindgate.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
//@Scope("prototype")
public class Employee {
   private int employeeId;
   private String name;
   private double salary;
   @Autowired
   private Address homeAddress;
   public Employee() {

               System.out.println("Default constructor of Employee Called");
   
   }
public Employee(int employeeId, String name, double salary, Address homeAddress) {
	super();
	this.employeeId = employeeId;
	this.name = name;
	this.salary = salary;
	this.homeAddress = homeAddress;
	 System.out.println("Overloded constructor of Employee Called");
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	System.out.println("setting employee Id"+employeeId);
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("Settimg Employee Name"+name);
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	System.out.println("Settting employee salary"+salary);
	this.salary = salary;
}
public Address getHomeAddress() {
	return homeAddress;
}
public void setHomeAddress(Address homeAddress) {
	System.out.println("Setting Address"+homeAddress);
	this.homeAddress = homeAddress;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAddress="
			+ homeAddress + "]";
}

}
