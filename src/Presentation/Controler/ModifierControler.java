package Presentation.Controler;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import BM.GestionActivite;
import Metier.Activite;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ModifierControler  implements Initializable {
	@FXML
	private TextField nom,prix,maxusers,description;
	private GestionActivite activite = new GestionActivite();
	@FXML
	private Label lbel;
	@FXML
	private Button modf;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
        String temp = ChoixModifControler.hyper.getText();
   	    ArrayList<Activite> des = new ArrayList<>();
   	    
   	 des.addAll(activite.DesActivite(temp));
   	 //remplir les text field avec les donnée de la bd 
   	 for(Activite a : des)
   	 {
   		nom.setText(a.getNom()); 
   		description.setText(a.getDescription());
   		maxusers.setText(Integer.toString(a.getMaxUtilisateur()));
   		prix.setText(Float.toString(a.getCout()));
		
	}
   	 //modification 
   	modf.setOnAction(new EventHandler<ActionEvent>(){
         @Override
               public void handle(ActionEvent arg0) {
              System.out.println("clicked");
 	      
              for (Activite a : activite.DesActivite(temp))
    	      {
    	    	  a.setNom(nom.getText());
    	    	  a.setDescription(description.getText());
    	    	  a.setCout(Float.parseFloat(prix.getText()));
    	    	  a.setMaxUtilisateur(Integer.parseInt(maxusers.getText()));
    	    	  activite.ValiderModification(a.getActiviteID(),a.getNom(),a.getDescription(),a.getCout(),a.getMaxUtilisateur(), a.getDomaineID());
    	      }
              lbel.setText("L'activité à été mdifié avec succés");
             
              }
   
 
		   });
	
}
	
}
	

