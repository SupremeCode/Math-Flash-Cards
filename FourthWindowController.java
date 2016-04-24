package application;

import javafx.fxml.FXML;


public class FourthWindowController {
	private Main main;

	public void setMain(Main main){
		this.main = main;
	}
	@FXML
	public void beginner(){
		main.multiplicationWindow();
	}
	@FXML
	public void intermediate(){
		main.multiplicationWindow2();
	}
	@FXML
	public void expert(){
		main.multiplicationWindow3();
	}
	@FXML
	public void goBack(){
		main.firstWindow();
	}
}
