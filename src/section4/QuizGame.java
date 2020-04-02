package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		c
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("dogs")) {
		// 4.  if the user's answer was correct, add one to their score 
		score = score + 1;
		}
		System.out.println(score);
		 JOptionPane.showMessageDialog(null, "correct! your score is now"+score);
		}
		System.out.println(score);
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer = JOptionPane.showInputDialog("do you like pastel colors or dark colors better?");
		if(answer.equals("pastel")) {
		score = score +1;
		}
		System.out.println(score);
		answer = JOptionPane.showInputDialog("what is your dog like?");
		if(answer.equals("the best")) {
		score = score +1;
		}
		System.out.println(score);
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
