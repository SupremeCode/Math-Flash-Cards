package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondWindowController {
	private Main main;
	@FXML private Button beginnerButton;
	@FXML private Button intermediateButton;
	@FXML private Button expertButton;
	@FXML private Button backButton;
	protected FirstWindowController fwc;

	public void setMain(Main main){
		this.main = main;
	}
	@FXML
	public void beginner(){
		main.additionWindow();
	}
	@FXML
	public void intermediate(){
		main.additionWindow2();
	}
	@FXML
	public void expert(){
		main.additionWindow3();
	}
	@FXML
	public void goBack(){
		main.firstWindow();
	}
}
