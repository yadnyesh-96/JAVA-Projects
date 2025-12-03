package StudentGradeApp;

class Student {
	
	private int marks[];
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String subject[];
	private String name;
	
	
	public void Display(){
		System.out.println();
		
		System.out.printf("-------  Academic Result  -------\n");
		System.out.println("Name : "+name);
		
		System.out.printf("%-15s %-10s %-10s\n", "Subject", "Marks", "Grade\n");
	    System.out.printf("---------------------------------\n");
	    
	    boolean res = false;
	    
		for(int i=0; i<subject.length; i++) {
			
			 String str=(marks[i]>=40?"P":"F");
			 if(marks[i]<40) {
				 res=true;
			 }
			
			System.out.printf("%-15s %-10d %-10s\n",subject[i],marks[i],str);
			
			
		}
		System.out.printf("---------------------------------\n");
		if(res) {
			System.out.println("Result : \t          Fail");
		}else {
			System.out.println("Result : \t          Pass");
		}
	}
}
