package studio9;

import java.util.Map;
import java.util.HashMap;

import assignment7.Student;


public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions

	private final Map<String,Student> database;
	
	public UniversityDatabase() {
		this.database = new HashMap<>();
	}
	public void addStudent(String accountName, Student student) {
		this.database.put(accountName, student);
	}

	public int getStudentCount() {
		return this.database.size();
	}

	public String lookupFullName(String accountName) {
		Student retrieved = this.database.get(accountName);
		if(retrieved != null) {
			return retrieved.getFullName();
		}
		return null;
	}

	public double getTotalBearBucks() {
		double total = 0;
		for( Student s : this.database.values()) {
			total += s.getBearBucksBalance();
		}
		return total;
	}
}
