package Presentation.Controler;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import BM.GestionActivite;
import Metier.Activite;
import Presentation.View.*;
public class AcceuilController implements Initializable {
	//Connecter les composants du fxml avec le controleur 
	@FXML
	private TitledPane one,two,three,four,five;
	@FXML
	private Label des1;
	@FXML
	//Les fenetres qu'on va app d'ici
	private Description des ;
	private ChoixDomaine choix;
	private ChoixDomaine2 choix2;
	private ChoixDomaine3 choix3;
	private ArrayList<String> liste_activite= new ArrayList<String>();
	private GestionActivite gestion = new GestionActivite();
	private ArrayList<Hyperlink> alllinks = new ArrayList<Hyperlink>();
	public static Hyperlink hi = new Hyperlink();
	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		//récupération des link lors de l'instanciation
		gettext.getInstance().settxt1(hi);
		gettext.getInstance().setPane(one);	gettext.getInstance().setPane(two);
		gettext.getInstance().setPane(three);	gettext.getInstance().setPane(four);
		gettext.getInstance().setPane(five);
		ArrayList<Hyperlink> links = new ArrayList<Hyperlink>();
	
		
	        GridPane grid = new GridPane() ;
	        GridPane grid1 = new GridPane() ;
	        GridPane grid2 = new GridPane() ;
	        GridPane grid3 = new GridPane() ;
	        GridPane grid4 = new GridPane() ;
	        one.setContent(grid);two.setContent(grid1);
	        three.setContent(grid2);four.setContent(grid3);
	        five.setContent(grid4);
			int i=0 ;int j;
			liste_activite.addAll(gestion.Acceuil(1));
		      for(String activite : liste_activite)
		      {
		    	 
		    	Hyperlink a = new Hyperlink(activite);
		    	grid.add(a, 0, i);
		    	i++;
		      }
		      i=0;
		      liste_activite.clear();
		      liste_activite.addAll(gestion.Acceuil(2));
		      for(String activite : liste_activite)
		      {
		    	Hyperlink a = new Hyperlink(activite);
		    	grid1.add(a, 0, i);
		    	i++;
		      }
		      i=0;
		      liste_activite.clear();
		      liste_activite.addAll(gestion.Acceuil(3));
		      for(String activite : liste_activite)
		      {
		    	Hyperlink a = new Hyperlink(activite);
		    	grid2.add(a, 0, i);
		    	i++;
		      }
		      i=0;
		      liste_activite.clear();
		      liste_activite.addAll(gestion.Acceuil(4));
		      for(String activite : liste_activite)
		      {
		    	Hyperlink a = new Hyperlink(activite);
		    	grid3.add(a, 0, i);
		    	i++;
		      }
		      i=0;
		      liste_activite.clear();
		      liste_activite.addAll(gestion.Acceuil(5));
		      for(String activite : liste_activite)
		      {
		    	Hyperlink a = new Hyperlink(activite);
		    	grid4.add(a, 0, i);
		    	i++;
		      }
		      
		      /*sauvegarder les links dans un tableau pour définir le handler qui emmenera à la page 
		       * de description de l'activité 
		       * 
		       */
		      for (j=0;j<grid.impl_getRowCount();j++)
			  	{
			  		links.add((Hyperlink) grid.getChildren().get(j));
			  	}
		     for (j=0;j<grid1.impl_getRowCount();j++)
			  	{
			  		links.add((Hyperlink) grid1.getChildren().get(j));
			  	}
		      for (j=0;j<grid2.impl_getRowCount();j++)
			  	{
			  		links.add((Hyperlink) grid2.getChildren().get(j));
			  	}
		      for (j=0;j<grid3.impl_getRowCount();j++)
			  	{
			  		links.add((Hyperlink) grid3.getChildren().get(j));
			  	}
		      for (j=0;j<grid4.impl_getRowCount();j++)
			  	{
			  		links.add((Hyperlink) grid4.getChildren().get(j));
			  	}
		      alllinks.addAll(links);
		      //Ouvrir la fenetre description lorsqu'on clique sur un link
		      for (Hyperlink h : alllinks)
			  	{
			  	   h.setOnAction(new EventHandler<ActionEvent>(){
			            @Override
			                  public void handle(ActionEvent arg0) {
			                
			                 try {
			                	 System.out.println("clicked");
			                	 hi=h;
			                	 System.out.println(hi.getText());
								des = new Description();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			                 }
			      
			    
			 		   });
			  	}
		      
		      
		}
	
    //handler qui ouvre ou il a le choix des domaines ou on veut ajouter une activité 
	public void ajouter(ActionEvent event) throws Exception
	{ 
		choix=new ChoixDomaine();
		((Node) event.getSource()).getScene().getWindow().hide(); 
		
	}
	public void Supprimer(ActionEvent event) throws Exception
	{ 
		
		choix2=new ChoixDomaine2();
		 ((Node) event.getSource()).getScene().getWindow().hide(); 
	}
	public void Modifier(ActionEvent event) throws Exception
	{ 
		choix3=new ChoixDomaine3();
	}
	
	
	


    }
