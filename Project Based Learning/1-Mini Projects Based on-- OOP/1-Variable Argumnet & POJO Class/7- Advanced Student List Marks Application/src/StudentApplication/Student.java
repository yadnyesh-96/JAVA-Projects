package StudentApplication;

class Student {
	/*
	 rollNo, name, marks[] (array of 3 subjects). 
	Store data for 5 students using an array of objects.
	 */
	private int rollNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	private int[] marks;
	private String name;
	private String[] subject;
	
	public void Display() {
		
		System.out.printf("Roll No.: %d   Name: %s",rollNo,name);
	}
}
