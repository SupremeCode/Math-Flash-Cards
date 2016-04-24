package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FirstWindowController {
	private Main main;
	private Stage primaryStage;
	@FXML private Button addition;
	@FXML private Button subtraction;
	@FXML private Button multiplication;
	@FXML private Button division;
	@FXML private Button closeButton;
	
	public void setMain(Main main, Stage primaryStage){
		this.main = main;
		this.primaryStage = primaryStage; //think about this later..............
	}
	@FXML public void add(){
		main.secondWindow();
	}
	@FXML public void subtract(){
		main.thirdWindow();
	}
	@FXML public void multiply(){
		main.fourthWindow();
	}
	@FXML public void divide(){
		main.fifthWindow();
	}
	@FXML public void closeWindow(){
		primaryStage.close();
		
	}
}
