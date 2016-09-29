package Presentation.View;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Description  {

	
	  public Description() throws Exception
	{
		Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/Presentation/View/Description.fxml"));
		   
		    Scene scene = new Scene(root); 
		    scene.getStylesheets().add(getClass().getResource("/Presentation/View/acceuil.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		}

	
	
	
		
	


	}
