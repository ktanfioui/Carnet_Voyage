package Presentation.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Modifier {
	
	
	
	public Modifier() throws Exception{
	    Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/Presentation/View/Modifier.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/Presentation/View/acceuil.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}
	
	

}
