package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MultiplicationWindowController3{
	private Main main;
	@FXML Label randomFirst;
	@FXML Label randomSecond;
	@FXML Label mathOperator;
	@FXML TextField answerField;
	@FXML Label correctStatement;
	@FXML Button answerButton;
	@FXML Label score;
	private int i = 0;
	
	public void setMain(Main main){
		this.main = main;
		beginMultiplication();
	}
	public void beginMultiplication(){
		answerField.setDisable(false);
		answerField.setText("");
		correctStatement.setText("");
		Random randomGenerator = new Random();
		int beginnerInt = randomGenerator.nextInt(850) + 99;
		randomFirst.setText(Integer.toString(beginnerInt));
		
		Random randomGenerator2 = new Random();
		int beginnerInt2 = randomGenerator2.nextInt(850) + 99;
		randomSecond.setText(Integer.toString(beginnerInt2));
	}
	
	public void userAnswers(KeyEvent Event){
		if(Event.getCode()==KeyCode.ENTER){
			checkAnswer();
		}
	}
	public void checkAnswer(){
		try{
		int x = Integer.parseInt(randomFirst.getText());
		int y = Integer.parseInt(randomSecond.getText());
		int z = Integer.parseInt(answerField.getText());
		if(z==(x*y)){
			correctStatement.setText("That's correct!");
			score.setText(Integer.toString(++i));
		}else if(z!=(x*y)){
			correctStatement.setText("The correct answer is: " +  (x*y));
		}else{
			correctStatement.setText("Please enter a number");
		}
		answerField.setDisable(true);
		}catch(RuntimeException e){
			correctStatement.setText("Please enter a number");
		}
	}
	public void goBack(){
		main.fourthWindow();
	}
}
