package application;

import javafx.fxml.FXML;


public class FifthWindowController {
	private Main main;

	public void setMain(Main main){
		this.main = main;
	}
	@FXML
	public void beginner(){
		main.divisionWindow();
	}
	@FXML
	public void intermediate(){
		main.divisionWindow2();
	}
	@FXML
	public void expert(){
		main.divisionWindow3();
	}
	@FXML
	public void goBack(){
		main.firstWindow();
	}
}
