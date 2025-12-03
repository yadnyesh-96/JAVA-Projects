package university;

public class NRIQuota extends Applicant{
	
	NRIQuota(String name,int score){
		super(name,score);
	}
	
	@Override
	int getRankScore() {
		return score+20;
	}
}
