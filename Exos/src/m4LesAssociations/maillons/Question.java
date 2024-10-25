package m4LesAssociations.maillons;

public class Question {
	private String question;
	private boolean reponse;
	private Question nextQuestion;
	public Question(String question, boolean reponse, Question nextQuestion) {
		super();
		this.question = question;
		this.reponse = reponse;
		this.nextQuestion = nextQuestion;
	}
	public Question(String question, boolean reponse) {
		super();
		this.question = question;
		this.reponse = reponse;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public boolean isReponse() {
		return reponse;
	}
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	public Question getNextQuestion() {
		return nextQuestion;
	}
	public void setNextQuestion(Question nextQuestion) {
		this.nextQuestion = nextQuestion;
	}
	
	

}
