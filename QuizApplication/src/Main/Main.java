package Main;

import Service.QuestionService;

public class Main {

	public static void main(String[] args) {
		QuestionService service = new QuestionService();
		service.playQuiz();
		service.calculateScore();
	}

}
