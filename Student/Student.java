package Student;

public class Student {
	private String name;
	private String course;
	private double fees;
	private String branch;
	private double cgpa;
	private String degree;
	private double sscPer;
	private double hscPer;
	private long phNo;

	// ✅ Constructor fixed
	public Student(String name, String course, double fees, String branch, double cgpa,
	               String degree, double sscPer, double hscPer, long phNo) {
		this.name = name;
		this.course = course;
		this.fees = fees;
		this.branch = branch;
		this.cgpa = cgpa;
		this.degree = degree;
		this.sscPer = sscPer;
		this.hscPer = hscPer;
		this.phNo = phNo;
	}

	// ✅ Getters
	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public double getFees() {
		return fees;
	}

	public double getSscPer() {
		return sscPer;
	}

	public double getHscPer() {
		return hscPer;
	}

	public long getPhNo() {
		return phNo;
	}

	// ✅ Setter for Branch with if-else
	public void setBranch(String branch) {
		if (branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("IT")) {
			this.branch = branch;
		} else {
			System.out.println("Invalid branch");
		}
	}

	// ✅ Setter for Phone Number with if-else
	public void setPhNo(long phNo) {
		if (String.valueOf(phNo).length() == 10) {
			this.phNo = phNo;
		} else {
			System.out.println("Invalid phone");
		}
	}
}
