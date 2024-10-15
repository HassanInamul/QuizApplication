package Service;

import java.util.Scanner;

import Questions.Questions;

public class QuestionService {
	Scanner sc = new Scanner(System.in);
	Questions[] question = new Questions[5];
	String selection[]=new String[question.length];
	
	public QuestionService() {
		question[0]=new Questions(1,"Size of int in JAVA ?","3","4","5","6","4");
		question[1]=new Questions(2,"Size of long in JAVA ?","3","4","8","6","8");
		question[2]=new Questions(3,"Size of double in JAVA ?","3","4","8","6","8");
		question[3]=new Questions(4,"Size of char in JAVA ?","1","2","5","6","2");
		question[4]=new Questions(5,"Size of bool in JAVA ?","3","4","1","6","1");
	}
	
	public void playQuiz() {
		int i=0;
		for(Questions q:question) {
			System.out.println("Question Number :"+q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			selection[i]=sc.nextLine();
			i++;
		}
	}
	public void calculateScore() {
		int score =0;
		for(int i=0;i<question.length;i++) {
			String act=question[i].getAnswer();
			String usr=selection[i];
			if(act.equalsIgnoreCase(usr)) {
				score=score+1;
			}
		}
		System.out.println("Your Score is: "+score);
		System.out.println("Thanks for Playing");
	}

}
