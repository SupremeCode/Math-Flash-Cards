package application;

import javafx.fxml.FXML;


public class ThirdWindowController {
	private Main main;

	public void setMain(Main main){
		this.main = main;
	}
	@FXML
	public void beginner(){
		main.subtractionWindow();
	}
	@FXML
	public void intermediate(){
		main.subtractionWindow2();
	}
	@FXML
	public void expert(){
		main.subtractionWindow3();
	}
	@FXML
	public void goBack(){
		main.firstWindow();
	}
}
