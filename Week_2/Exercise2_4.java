package Week_2;

// This is the main class Question
public class Exercise2_4 {
	public static void main(String[] args) {
		Answer a = new Answer(10, "MCQ");
	}
}

class Answer {
	Answer() {
		System.out.println("You got nothing.");
	}

	Answer(int marks, String type) {
		this();
		System.out.print("You got " + marks + " for an " + type);

	}

}


/*----------OUTPUT---------
 * You got nothing.
 * You got 10 for an MCQ
---------------------------*/