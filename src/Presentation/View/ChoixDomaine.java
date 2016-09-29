package Presentation.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChoixDomaine {
	public ChoixDomaine() throws Exception{
	    Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/Presentation/View/ChoixDomaine.fxml"));
		root.setId("pane1");
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/Presentation/View/acceuil.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	
	}

}
