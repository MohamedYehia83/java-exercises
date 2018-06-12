package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class EmployeeTest {

	@Test
	public void testReturnEmployeeId() {
		Employee myNewEmployee = new Employee(5011 ,"Mark" , "Jerard" ,new Double(30000.00));
//      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		assertEquals("It should return employee id is 5011",     5011,     myNewEmployee.getEmployeeId());
	}
	
	@Test
	public void testReturnFirstName() {
		Employee myNewEmployee = new Employee(50,"Mark", "Jerard",new Double(30000.00));
//      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		assertEquals("It should return first name Mark",    "Mark"    , myNewEmployee.FirstName());
	}
	
	@Test
	public void testReturnLastName() {
		Employee myNewEmployee = new Employee(50,"Mark", "Jerard",new Double(30000.00));
//      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		assertEquals("It should return last name Jerard",    "Jerard"    , myNewEmployee.LastName());
	}
	
	
	@Test
	public void testReturnAnnualSalary() {
		Employee myNewEmployee = new Employee(50 ,"Mark" , "Jerard" ,new Double(30000.00));
//      assertEquals("message if test fails"    ,expected=result, execute-the-method
		assertTrue("The Salary should be 30000.00", new Double(30000.00) ==  myNewEmployee.getAnnualSalary());
	}
	@Test
	public void testGetRaiseSalary1Percent() {
		Employee myNewEmployee = new Employee(50 ,"Mark" , "Jerard" ,new Double(30300.00));
		assertTrue("Should get salary after raise by 1% 30300.00", new Double(30300.00) == myNewEmployee.getAnnualSalary());
}
}