package university;

public class DefenseQuota extends Applicant {

	DefenseQuota(String name, int score) {
		super(name, score);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	int getRankScore() {
		return score+10;
	}
}
