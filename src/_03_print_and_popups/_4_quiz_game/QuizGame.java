package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("What is 2 times 5?");
		if (input.equals("10")) {
			score++;
		}
		String inputc = JOptionPane.showInputDialog("What is 7 times 3?");
		if (inputc.equals("21")) {
			score++;
		}
		String inputb = JOptionPane.showInputDialog("What is 4 times 13?");
		if (inputb.equals("52")) {
			score++;
		}
		String inputa = JOptionPane.showInputDialog("What is the sine of 30 degrees?");
		if (inputa.equals("1/2")) {
			score++;
		}
		JOptionPane.showMessageDialog(null, "Your score was " + score);
		
		
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
