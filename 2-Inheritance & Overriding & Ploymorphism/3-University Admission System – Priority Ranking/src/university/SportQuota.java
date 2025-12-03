package university;

public class SportQuota extends Applicant {
	
	//child class constructor
	SportQuota(String name, int score){
		super(name,score);
	}
	
	//overridden the child class method here 
	@Override
	int getRankScore(){
		return score+15;
	}
	
}
