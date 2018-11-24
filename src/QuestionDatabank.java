

public class QuestionDatabank {
	private String question ;
	private char answer;
	
	@SuppressWarnings("null")
	public QuestionDatabank () {
		question="";
		answer=(Character) null;
	}
	public QuestionDatabank (String ques,char ans) {
		question=ques;
		answer=ans;
	}
	public QuestionDatabank (QuestionDatabank Q) {
		question=Q.question;
		answer=Q.answer;
	}
	public String getQuestion() {
		return question;
	}
	public void  setQuestion(String quest) {
		question=quest;
	}
	public void getselectQuestion() {
		
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answ) {
		answer=answ;
	}	


	

}
