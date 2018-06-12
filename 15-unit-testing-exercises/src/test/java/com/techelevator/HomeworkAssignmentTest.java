package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class HomeworkAssignmentTest {

	@Test
	public void testReturnTotalMarks() {
		
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		
		newHomeworkAssignment.setTotalMarks(47);
//      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		assertEquals("That's not the total marks",     47     , newHomeworkAssignment.getTotalMarks());
	}
	
	@Test
	public void testReturnPossibleMarks() {
		
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(90);
		
	
//      assertEquals("message if test fails"      ,  expected=result, execute-the-method
		assertEquals("That's not the possible marks",     90     , newHomeworkAssignment.getPossibleMarks());
	}	
	
	@Test
	public void testGetAOn90Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(90);
		
		assertEquals("Should get an A for 90%", "A", newHomeworkAssignment.getLetterGrade());
		
	}
	
	@Test
	public void testGetBOn89Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(89);
		
		assertEquals("Should get an B for 89%", "B", newHomeworkAssignment.getLetterGrade());
		
	}

	@Test
	public void testGetBOn80Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(80);
		
		assertEquals("Should get an B for 80%", "B", newHomeworkAssignment.getLetterGrade());
		
	}

	@Test
	public void testGetCOn79Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(79);
		
		assertEquals("Should get an C for 79%", "C", newHomeworkAssignment.getLetterGrade());
		
	}

	@Test
	public void testGetCOn70Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(70);
		
		assertEquals("Should get an C for 70%", "C", newHomeworkAssignment.getLetterGrade());
		
	}

	@Test
	public void testGetDOn69Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(69);
		
		assertEquals("Should get an D for 69%", "D", newHomeworkAssignment.getLetterGrade());
		
	}

	@Test
	public void testGetDOn60Percent() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(60);
		
		assertEquals("Should get an D for 60%", "D", newHomeworkAssignment.getLetterGrade());
		
	}

	@Test
	public void testGetFOn59PercentOrLess() {
		HomeworkAssignment newHomeworkAssignment = new HomeworkAssignment(100);
		newHomeworkAssignment.setTotalMarks(59);
		
		assertEquals("Should get an F for 59% or less", "F", newHomeworkAssignment.getLetterGrade());
		
	}
}


