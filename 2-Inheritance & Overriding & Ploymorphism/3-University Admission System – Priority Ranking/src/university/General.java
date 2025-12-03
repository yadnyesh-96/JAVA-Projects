package university;

public class General extends Applicant {
	
	
	General(String name,int score){
		super(name,score);
	}
	
	@Override
	int getRankScore() {
		return score;
	}
	
}
