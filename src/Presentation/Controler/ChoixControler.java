package Presentation.Controler;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import Presentation.View.*;
public class ChoixControler implements Initializable {

	@FXML
	private Button un,deux,trois,quatre,cinq; 

	private Ajouter aj;
	private Supprimer sup;
	private ChoixActiviteModif mod;
	public ArrayList<Button> list_bouton = new ArrayList<>();
	public static String selectedDomaine= new String();
	
	@Override
	//Initialiser les boutons et remplir ArrayList par nos boutons puisqu'ils ouvrent tous la même page
	public void initialize(URL arg0, ResourceBundle arg1) {
		gettext.getInstance().setBut1(un);
		gettext.getInstance().setBut2(deux);
		gettext.getInstance().setBut3(trois);
        gettext.getInstance().setBut4(quatre);
        gettext.getInstance().setBut5(cinq);
        list_bouton.add(gettext.getInstance().getBut1());
        list_bouton.add(gettext.getInstance().getBut2());
        list_bouton.add(gettext.getInstance().getBut3());
        list_bouton.add(gettext.getInstance().getBut4());
        list_bouton.add(gettext.getInstance().getBut5());
        }
	//Handler qui va ouvrir la page d'ajout
	public void ajouHandler(ActionEvent event) throws Exception
	{
		String id= new String();
		for (Button bouton : list_bouton)
		{
			if(event.getSource()==bouton)
			{
		      bouton.setOnAction(new EventHandler<ActionEvent>() {
              @Override
		     public void handle(ActionEvent arg0) {
				 try {
					 
				   aj = new Ajouter();
				   
				   ((Node) event.getSource()).getScene().getWindow().hide(); 
				} catch (Exception e) {e.printStackTrace();} 
					}});
		      ChoixControler.selectedDomaine=bouton.getId();
		     }
		 }
	 }
	//Handler qui va ouvrir la page de suppression
	public void suppHandler(ActionEvent event) throws Exception
	{
	    String id= new String();
		for (Button bouton : list_bouton)
		{
			if(event.getSource()==bouton)
			{
		      bouton.setOnAction(new EventHandler<ActionEvent>() {
              private String args;

			@Override
		     public void handle(ActionEvent arg0) {
				 try {
					
				   sup= new Supprimer();
				   ((Node) event.getSource()).getScene().getWindow().hide(); 
				} catch (Exception e) {e.printStackTrace();} 
					}});
		      ChoixControler.selectedDomaine=bouton.getId();
		     }
		 }
		
		
	}
	//Handler qui va ouvrir la page de modification
	public void modifHandler(ActionEvent event) throws Exception
	{
		
		 String id= new String();
			for (Button bouton : list_bouton)
			{
				if(event.getSource()==bouton)
				{
			      bouton.setOnAction(new EventHandler<ActionEvent>() {
	              private String args;

				@Override
			     public void handle(ActionEvent arg0) {
					 try {
						//choisir l'activité à modifier
					   mod= new ChoixActiviteModif();
					} catch (Exception e) {e.printStackTrace();} 
						}});
			      ChoixControler.selectedDomaine=bouton.getId();
			     }
			 }
		
  }
	
	

}
