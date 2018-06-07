package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks ;
	private int possibleMarks ;
	private String submitterName ;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade() {
        double marksPercentage = totalMarks / possibleMarks;
        if (marksPercentage >= 90) {
            return "A";
        }
        else if (marksPercentage >= 80 && marksPercentage <= 89) {
            return "B";
        }
        else if (marksPercentage >= 70 && marksPercentage <= 79) {
            return "C";
        }
        else if (marksPercentage >= 60 && marksPercentage <= 69) {
            return "D";
        }
        else {
            return "F";
        }
    }

	
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	
	
	
	
}
