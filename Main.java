package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		firstWindow();
	}
	public void firstWindow(){
		try{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("FirstWindowView.fxml"));
		AnchorPane pane = loader.load();
		
		Scene scene = new Scene(pane);
		
		FirstWindowController firstWindowController = loader.getController();
		firstWindowController.setMain(this, primaryStage);
		
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void secondWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SecondWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			SecondWindowController secondWindowController = loader.getController();
			secondWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
			
	}
	public void additionWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AdditionView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			AdditionWindowController additionWindowController = loader.getController();
			additionWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
			
	}
	public void additionWindow2(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AdditionView2.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			AdditionWindowController2 additionWindowController2 = loader.getController();
			additionWindowController2.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void additionWindow3(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AdditionView3.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			AdditionWindowController3 additionWindowController3 = loader.getController();
			additionWindowController3.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void thirdWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ThirdWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			ThirdWindowController thirdWindowController = loader.getController();
			thirdWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
			
	}
	public void subtractionWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SubtractionView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			SubtractionWindowController subtractionWindowController = loader.getController();
			subtractionWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void subtractionWindow2(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SubtractionView2.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			SubtractionWindowController2 subtractionWindowController2 = loader.getController();
			subtractionWindowController2.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void subtractionWindow3(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("SubtractionView3.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			SubtractionWindowController3 subtractionWindowController3 = loader.getController();
			subtractionWindowController3.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void fourthWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("FourthWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			FourthWindowController fourthWindowController = loader.getController();
			fourthWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
			
	}
	public void multiplicationWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MultiplicationView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			MultiplicationWindowController multiplicationWindowController = loader.getController();
			multiplicationWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void multiplicationWindow2(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MultiplicationView2.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			MultiplicationWindowController2 multiplicationWindowController2 = loader.getController();
			multiplicationWindowController2.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void multiplicationWindow3(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MultiplicationView3.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			MultiplicationWindowController3 multiplicationWindowController3 = loader.getController();
			multiplicationWindowController3.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void fifthWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("FifthWindowView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			FifthWindowController fifthWindowController = loader.getController();
			fifthWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
			
	}
	public void divisionWindow(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("DivisionView.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			DivisionWindowController divisionWindowController = loader.getController();
			divisionWindowController.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void divisionWindow2(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("DivisionView2.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			DivisionWindowController2 divisionWindowController2 = loader.getController();
			divisionWindowController2.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	public void divisionWindow3(){
		try{
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("DivisionView3.fxml"));
			AnchorPane pane = loader.load();
			
			Scene scene = new Scene(pane);
			
			DivisionWindowController3 divisionWindowController3 = loader.getController();
			divisionWindowController3.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			} catch(Exception e){
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
