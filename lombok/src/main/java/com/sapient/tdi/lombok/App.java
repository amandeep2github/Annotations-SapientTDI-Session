package com.sapient.tdi.lombok;

import com.sapient.tdi.lombok.domain.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee emp1 = new Employee();
    	emp1.setId(101l);
		Employee emp2 = new Employee();
		emp2.setId(101l);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1);
    }
}
