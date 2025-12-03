package university;

public class Adapter {
	
	void ScoreCalculate(Applicant a) {
		int score=a.getRankScore();
		System.out.println(a.name+"\t\t\t"+score);
//		System.out.println("Score :"+score);
		
	}
}
