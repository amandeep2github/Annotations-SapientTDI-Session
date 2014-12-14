package com.sapient.tdi.lombok.domain;

import lombok.Data;
import lombok.Getter;



@Data
public class Employee {
	//@Getter
	private Long id;
	//@Getter
	private String firstName;
	//@Getter
	private String lastName;	
	@Override
	public String toString() {
		return String.format("id - %d, First name - %s, Last name - %s", id, firstName, lastName);
	}
}
