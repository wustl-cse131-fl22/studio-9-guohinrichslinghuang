package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	
	private String firstName;
	private String lastName;
	private int studentID;
	private int atmptCredits;
	private int passingCredits;
	private double gradeQualityPoints;
	private double bearBucks;
	private double grade;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = id;
	
	}

	public String getFullName() {
		String fullName = this.firstName + " " + this.lastName;
		return fullName;
	}

	public int getId() {
		return this.studentID;
	}

	public void depositBearBucks(double amount) {
		this.bearBucks += amount;
	}

	public double getBearBucksBalance() {
		return bearBucks;
	}
}
