import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI implements ActionListener{
	
	static String SearchWord; 
	private JFrame frame;
	private JPanel panel;
	private JPanel panel2;
	private JPanel panel3;
	private JTextField Guess;
	private JButton SubmitButton;
	private JLabel EnterText;
	private int WordCounter = 0;
	private JLabel L11,L12,L13,L14,L15,L21,L22,L23,L24,L25,L31,L32,L33,L34,L35,L41,L42,L43,L44,L45,L51,L52,L53,L54,L55;
	public static JLabel CorrectWord,RemainingGuessesOrCorrect;
	
	
	public static void adjustsize(JLabel label) {
		label.setFont(new Font("Serif", Font.PLAIN, 20));
	}
	
	public static void wait(int ms){
	   
	        try {
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    
	}

	public GUI() {
		frame = new JFrame();
		Guess = new JTextField("");
		
		SubmitButton = new JButton("Submit");
		SubmitButton.addActionListener(this);
		SubmitButton.setMinimumSize(new Dimension(30, 15));
		SubmitButton.setMaximumSize(new Dimension(30, 15));
		SubmitButton.setPreferredSize(new Dimension(30, 15));
		
		EnterText = new JLabel("Enter your guess: ");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		panel.add(EnterText);
		panel.add(Guess);
		panel.add(SubmitButton);
		frame.getContentPane().add(panel, "North");
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5,5));
		L11 = new JLabel("  ", SwingConstants.CENTER); L11.setOpaque(true); L11.setBackground(Color.lightGray); 
		L12 = new JLabel("  ", SwingConstants.CENTER); L12.setOpaque(true); L12.setBackground(Color.lightGray);
		L13 = new JLabel("  ", SwingConstants.CENTER); L13.setOpaque(true); L13.setBackground(Color.lightGray);
		L14 = new JLabel("  ", SwingConstants.CENTER); L14.setOpaque(true); L14.setBackground(Color.lightGray);
		L15 = new JLabel("  ", SwingConstants.CENTER); L15.setOpaque(true); L15.setBackground(Color.lightGray);
		L21 = new JLabel("  ", SwingConstants.CENTER); L21.setOpaque(true); L21.setBackground(Color.lightGray);
		L22 = new JLabel("  ", SwingConstants.CENTER); L22.setOpaque(true); L22.setBackground(Color.lightGray);
		L23 = new JLabel("  ", SwingConstants.CENTER); L23.setOpaque(true); L23.setBackground(Color.lightGray);
		L24 = new JLabel("  ", SwingConstants.CENTER); L24.setOpaque(true); L24.setBackground(Color.lightGray);
		L25 = new JLabel("  ", SwingConstants.CENTER); L25.setOpaque(true); L25.setBackground(Color.lightGray);
		L31 = new JLabel("  ", SwingConstants.CENTER); L31.setOpaque(true); L31.setBackground(Color.lightGray);
		L32 = new JLabel("  ", SwingConstants.CENTER); L32.setOpaque(true); L32.setBackground(Color.lightGray);
		L33 = new JLabel("  ", SwingConstants.CENTER); L33.setOpaque(true); L33.setBackground(Color.lightGray);
		L34 = new JLabel("  ", SwingConstants.CENTER); L34.setOpaque(true); L34.setBackground(Color.lightGray);
		L35 = new JLabel("  ", SwingConstants.CENTER); L35.setOpaque(true); L35.setBackground(Color.lightGray);
		L41 = new JLabel("  ", SwingConstants.CENTER); L41.setOpaque(true); L41.setBackground(Color.lightGray);
		L42 = new JLabel("  ", SwingConstants.CENTER); L42.setOpaque(true); L42.setBackground(Color.lightGray);
		L43 = new JLabel("  ", SwingConstants.CENTER); L43.setOpaque(true); L43.setBackground(Color.lightGray);
		L44 = new JLabel("  ", SwingConstants.CENTER); L44.setOpaque(true); L44.setBackground(Color.lightGray);
		L45 = new JLabel("  ", SwingConstants.CENTER); L45.setOpaque(true); L45.setBackground(Color.lightGray);
		L51 = new JLabel("  ", SwingConstants.CENTER); L51.setOpaque(true); L51.setBackground(Color.lightGray);
		L52 = new JLabel("  ", SwingConstants.CENTER); L52.setOpaque(true); L52.setBackground(Color.lightGray);
		L53 = new JLabel("  ", SwingConstants.CENTER); L53.setOpaque(true); L53.setBackground(Color.lightGray);
		L54 = new JLabel("  ", SwingConstants.CENTER); L54.setOpaque(true); L54.setBackground(Color.lightGray);
		L55 = new JLabel("  ", SwingConstants.CENTER); L55.setOpaque(true); L55.setBackground(Color.lightGray);
		panel2.add(L11);
		panel2.add(L12);
		panel2.add(L13);
		panel2.add(L14);
		panel2.add(L15);
		panel2.add(L21);
		panel2.add(L22);
		panel2.add(L23);
		panel2.add(L24);
		panel2.add(L25);
		panel2.add(L31);
		panel2.add(L32);
		panel2.add(L33);
		panel2.add(L34);
		panel2.add(L35);
		panel2.add(L41);
		panel2.add(L42);
		panel2.add(L43);
		panel2.add(L44);
		panel2.add(L45);
		panel2.add(L51);
		panel2.add(L52);
		panel2.add(L53);
		panel2.add(L54);
		panel2.add(L55);
		
		frame.getContentPane().add(panel2, "Center");
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(2,0));
		RemainingGuessesOrCorrect = new JLabel("Remaining Guesses: ", SwingConstants.CENTER); RemainingGuessesOrCorrect.setOpaque(true); RemainingGuessesOrCorrect.setBackground(Color.CYAN);
		CorrectWord = new JLabel("  ", SwingConstants.CENTER); CorrectWord.setOpaque(true); 
		panel3.add(RemainingGuessesOrCorrect);
		panel3.add(CorrectWord);
		frame.getContentPane().add(panel3, "South");
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Wordle");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static Set<String> MakeSet(String Filename){
		Set<String> FiveLetterWords = new HashSet<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(Filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				FiveLetterWords.add(line);
			}
		}catch (FileNotFoundException e){
			System.err.println("FileNotFoundException: " + e.getMessage());
		}catch (IOException e){
			System.err.println("IOException: " + e.getMessage());
		}
		return FiveLetterWords;
	}
	
	public static String GetSearchWord(String[] PossibleAnswers){
		int UpperBound = PossibleAnswers.length - 1;
		Random Rand = new Random();
		int RandomNum = Rand.nextInt(UpperBound);
		return PossibleAnswers[RandomNum];
	}
	
	public static String CheckGuess(char Letter, int index) {
		boolean Exists = false;
		String ReturnString; 
		String LetterString = String.valueOf(Letter);
		for(char c: SearchWord.toCharArray()) {
			if(c == Letter) {
				Exists = true;
			}
		}
		if(Exists && SearchWord.charAt(index) == Letter) {
			ReturnString = "<html><p color=\"#009628\">" + LetterString + "</p></html>";
			return ReturnString;
		}else if(Exists) {
			ReturnString = "<html><p color=\"#ad7400\">" + LetterString + "</p></html>";
			return ReturnString;
		}else {
			return LetterString;
		}
	
	}
	
	public static void main(String[] args) {
		
		Set<String> SetAnswerWords = new HashSet<String>();
		SetAnswerWords = MakeSet("wordle-answers-alphabetical.txt");
		
		Set<String> SetGuessable = new HashSet<String>();
		SetGuessable = MakeSet("wordle-allowed-guesses.txt");
		
		String[] ArrayAnswerWords = new String[SetAnswerWords.size()];
		ArrayAnswerWords = SetAnswerWords.toArray(ArrayAnswerWords);
		SearchWord = GetSearchWord(ArrayAnswerWords);
		
		System.out.println(SearchWord);
		
		new GUI();
	}
	
	public static boolean CorrectGuess(String Guess) {
		System.out.println("Checking if guess is right");
		if(Guess.equals(SearchWord)) {
			System.out.println("guess is right");
			return true;
		}return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String UserGuess = Guess.getText();
		
		
		if(WordCounter == 0) {
			
			L11.setText(CheckGuess(UserGuess.charAt(0),0));
			L12.setText(CheckGuess(UserGuess.charAt(1),1));
			L13.setText(CheckGuess(UserGuess.charAt(2),2));
			L14.setText(CheckGuess(UserGuess.charAt(3),3));
			L15.setText(CheckGuess(UserGuess.charAt(4),4));
			if(CorrectGuess(UserGuess)) {
				CorrectWord.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setText("Correct!");
			
			}
			
		}
		if(WordCounter == 1) {
		
			L21.setText(CheckGuess(UserGuess.charAt(0),0));
			L22.setText(CheckGuess(UserGuess.charAt(1),1));
			L23.setText(CheckGuess(UserGuess.charAt(2),2));
			L24.setText(CheckGuess(UserGuess.charAt(3),3));
			L25.setText(CheckGuess(UserGuess.charAt(4),4));
			if(CorrectGuess(UserGuess)) {
				CorrectWord.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setText("Correct!");
			}
		}
		if(WordCounter == 2) {
			
			L31.setText(CheckGuess(UserGuess.charAt(0),0));
			L32.setText(CheckGuess(UserGuess.charAt(1),1));
			L33.setText(CheckGuess(UserGuess.charAt(2),2));
			L34.setText(CheckGuess(UserGuess.charAt(3),3));
			L35.setText(CheckGuess(UserGuess.charAt(4),4));
			if(CorrectGuess(UserGuess)) {
				CorrectWord.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setText("Correct!");
				
			}
		}
		if(WordCounter == 3) {
			
			L41.setText(CheckGuess(UserGuess.charAt(0),0));
			L42.setText(CheckGuess(UserGuess.charAt(1),1));
			L43.setText(CheckGuess(UserGuess.charAt(2),2));
			L44.setText(CheckGuess(UserGuess.charAt(3),3));
			L45.setText(CheckGuess(UserGuess.charAt(4),4));
			if(CorrectGuess(UserGuess)) {
				CorrectWord.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setText("Correct!");
			}
		}
		if(WordCounter == 4) {
			
			L51.setText(CheckGuess(UserGuess.charAt(0),0));
			L52.setText(CheckGuess(UserGuess.charAt(1),1));
			L53.setText(CheckGuess(UserGuess.charAt(2),2));
			L54.setText(CheckGuess(UserGuess.charAt(3),3));
			L55.setText(CheckGuess(UserGuess.charAt(4),4));
			if(CorrectGuess(UserGuess)) {
				CorrectWord.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setBackground(Color.GREEN);
				RemainingGuessesOrCorrect.setText("Correct!");
			}
			RemainingGuessesOrCorrect.setBackground(Color.RED);
			CorrectWord.setBackground(Color.RED);
			CorrectWord.setText("Correct Word Is: " + SearchWord);
			
		}
		
		WordCounter++;
		
        Guess.setText("");
        
	
	}
}
