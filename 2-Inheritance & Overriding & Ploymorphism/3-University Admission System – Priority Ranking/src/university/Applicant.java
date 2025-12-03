package university;

public class Applicant {
	String name;
	int score;
	
	//parent class parameterized constructor 
	Applicant(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	// get Rank score method
	int getRankScore() {
		return score;
	}
}
