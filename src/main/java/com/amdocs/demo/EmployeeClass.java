package com.amdocs.demo;

class Employee{
	private int id;
	private String name;
	private int salary;
	
	int getId() {
		return this.id;
	}
    String getName() {
    	return this.name;
    }
    int getSalary() {
    	return this.salary;
    }
    
    void setId(int id) {
    	this.id=id;
    }
    
    void setName(String name) {
    	this.name=name;
    }
    
    void setSalary(int sal) {
    	this.salary=sal;
    }
    
    public String toString(){
    	  return id+" "+name+" "+salary;  
    }  
}


public class EmployeeClass {
	public static void main(String[] args) {
		
	}
}
