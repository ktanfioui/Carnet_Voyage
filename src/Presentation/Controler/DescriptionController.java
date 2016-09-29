package Presentation.Controler;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import BM.GestionActivite;
import Metier.Activite;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class DescriptionController implements Initializable {
@FXML
private Label lb1,lb2,lb3,lb4;
private AcceuilController acc = new AcceuilController();
private GestionActivite activite = new GestionActivite();


@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	/*
	 * 
	 * récupère le link cliqué dans acceuil , prend son text qui est le nom de lactivité et cherche les informations 
	 * de la base de donnée 
	 */
	 String temp = AcceuilController.hi.getText();
	 ArrayList<Activite> des = new ArrayList<>();
	 String nom= new String("");
	 String desc=new String("");
	 int max;	float cout;
	 des.addAll(activite.DesActivite(temp));
	 for(Activite a : des)
	 {
		nom=a.getNom();
		lb1.setText(nom); 
		a.getDescription();
		desc=a.getDescription();
		lb2.setText(desc);
		max=a.getMaxUtilisateur();
		lb3.setText(Integer.toString(max));
		cout=a.getCout();
		lb4.setText(Float.toString(cout));
	}
	}
	 
	
	 
	
}




	 
	 


	

