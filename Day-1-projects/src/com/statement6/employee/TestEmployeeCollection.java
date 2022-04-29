package com.statement6.employee;

import java.util.Vector;

public class TestEmployeeCollection {
	
	public static void main(String[] args) {
		Vector<Employee> v = addInput();
		display(v);
		}

	private static Vector<Employee> addInput() {
		Employee e1=new Employee (10,"ravi", "chandra");
		Employee e2=new Employee (20,"shiva", "kumar");
		Employee e3=new Employee (30,"puneeth", "raj");
		Vector<Employee> v=new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	
		}

	private static void display(Vector<Employee> v) {
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}	
	}
}
