
/**
 * https://secure.ecs.soton.ac.uk/noteswiki/w/COMP1202/Labs/9
 * @author OscarVanL
 *
 */
public class FlashCard {
	
	String question;
	String answer;

	FlashCard(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}
}
