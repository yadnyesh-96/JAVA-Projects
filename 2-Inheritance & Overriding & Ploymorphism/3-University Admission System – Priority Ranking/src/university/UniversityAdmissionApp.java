/*
 Q3. University Admission System – Priority Ranking
 
	Base class: Applicant
		Fields: name, score
 		Method: getRankScore() → returns score directly

	Child classes:
		SportsQuota: adds +15 to score
		DefenseQuota: adds +10 to score
		General: no extra
		NRIQuota: +20 but fee is 3× normal

	Task:
	Take 12 applicants (mix of all categories).
	Override getRankScore() in each child.
	Sort applicants by rank score (high to low).
	Print top 3 shortlisted candidates.

	Concepts ==> Overriding, Sorting array of objects, Multiple child classes, Priority logic
 */

package university;

import java.util.*;

public class UniversityAdmissionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Adapter ap=new Adapter();
		
		Applicant a1[]=new Applicant[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter the Student Details below:");
			sc.nextLine();
			System.out.println("ID:"+(i+1));
			System.out.println("Enter Student Name:");
			String name=sc.nextLine();

			System.out.println("Enter the Score :");
			int score=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Please select your category");
			System.out.println("1.)Sport Quota 2.)Defense Quota 3.)General 4.)NRI Quota");
			int choice=sc.nextInt();
			//sc.nextLine();
			switch (choice){
				case 1: a1[i]=new SportQuota(name,score); break;
				case 2: a1[i]=new DefenseQuota(name,score); break;
				case 3: a1[i]=new General(name,score); break;
				case 4: a1[i]=new NRIQuota(name,score); break;
				default: 
					System.out.println("Invalid choice! Added as General.");
					a1[i] = new General(name, score);
			}
		}
		
		System.out.println("Student Name\t\t Score");
		System.out.println("----------------------");
		
		int max=0;
		for(Applicant a:a1) {
			ap.ScoreCalculate(a);
		}
		
			
		/*	
		a1=new SportQuota("ABC",15);
		ap.ScoreCalculate(a1);
		
		a1=new DefenseQuota("DEF",15);
		ap.ScoreCalculate(a1);
		
		a1=new General("GHI",15);
		ap.ScoreCalculate(a1);
		
		a1=new NRIQuota("JKL",15);
		ap.ScoreCalculate(a1);
		*/
	}
	

}
