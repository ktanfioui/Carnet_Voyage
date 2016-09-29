package Presentation.Controler;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import BM.GestionActivite;
import Presentation.View.Acceuil;
public class SupprimerControler  implements Initializable{
	@FXML
	private TitledPane suppression;
	private ArrayList<String> liste_activite= new ArrayList<String>();
	private GestionActivite gestion = new GestionActivite();
	ArrayList<Hyperlink> links = new ArrayList<Hyperlink>();
	private Acceuil acceuil;

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//récupérer le titled pane
		gettext.getInstance().setPane(suppression);
		GridPane grid = new GridPane();
		int i=0;
		//Remplire le contenu du titledPane activités sous forme de hyperlinks à patir de la bd 
		if(ChoixControler.selectedDomaine.equals("un"))
		{  
	      liste_activite.addAll(gestion.Acceuil(1));
	      for(String activite : liste_activite)
	      {
	    
	    	gettext.getInstance().getPane().setText("Hebergement");
	    	Hyperlink a = new Hyperlink(activite);
	    	grid.add(a, 0, i);
	    	i++;
	       }
	      gettext.getInstance().getPane().setContent(grid);
	      for (i=0;i<grid.impl_getRowCount();i++)
		  	{
		  		links.add((Hyperlink) grid.getChildren().get(i));
		  	}
		  // la suppression de l'activité quand on clique sur le hyper link
		  	for (Hyperlink h : links)
		  	{
		  	   h.setOnAction(new EventHandler<ActionEvent>(){
		            @Override
		                  public void handle(ActionEvent arg0) {
		                 System.out.println("clicked");
		    	          gestion.ValiderSuppression(h.getText(), 1);
		    	          h.setVisible(false);
		    	          try {
								acceuil=new Acceuil();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                 }
		      
		    
		 		   });
		  	}
	     }  //ENDIF
		if(ChoixControler.selectedDomaine.equals("deux"))
		{  
	      liste_activite.addAll(gestion.Acceuil(2));
	      for(String activite : liste_activite)
	      {
	    
	    	gettext.getInstance().getPane().setText("Sport");
	    	Hyperlink a = new Hyperlink(activite);
	    	grid.add(a, 0, i);
	    	i++;
	       }
	      gettext.getInstance().getPane().setContent(grid);
	      for (i=0;i<grid.impl_getRowCount();i++)
		  	{
		  		links.add((Hyperlink) grid.getChildren().get(i));
		  	}
		  // la suppression de l'activité quand on clique sur le hyper link
		  	for (Hyperlink h : links)
		  	{
		  	   h.setOnAction(new EventHandler<ActionEvent>(){
		            @Override
		                  public void handle(ActionEvent arg0) {
		                 System.out.println("clicked");
		    	          gestion.ValiderSuppression(h.getText(), 2);
		    	          h.setVisible(false);
		    	          try {
							acceuil=new Acceuil();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                 }
		      
		    
		 		   });
		  	}
	     }  //ENDIF
		if(ChoixControler.selectedDomaine.equals("trois"))
		{  
	      liste_activite.addAll(gestion.Acceuil(3));
	      for(String activite : liste_activite)
	      {
	    
	    	gettext.getInstance().getPane().setText("Restauration");
	    	Hyperlink a = new Hyperlink(activite);
	    	grid.add(a, 0, i);
	    	i++;
	       }
	      gettext.getInstance().getPane().setContent(grid);
	      for (i=0;i<grid.impl_getRowCount();i++)
		  	{
		  		links.add((Hyperlink) grid.getChildren().get(i));
		  	}
		  // la suppression de l'activité quand on clique sur le hyper link
		  	for (Hyperlink h : links)
		  	{
		  	   h.setOnAction(new EventHandler<ActionEvent>(){
		            @Override
		                  public void handle(ActionEvent arg0) {
		                 System.out.println("clicked");
		    	          gestion.ValiderSuppression(h.getText(), 3);
		    	          h.setVisible(false);
		    	          try {
								acceuil=new Acceuil();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			                 
		                 }
		      
		    
		 		   });
		  	}
	     }  //ENDIF
		if(ChoixControler.selectedDomaine.equals("quatre"))
		{  
	      liste_activite.addAll(gestion.Acceuil(4));
	      for(String activite : liste_activite)
	      {
	    
	    	gettext.getInstance().getPane().setText("Récréativité");
	    	Hyperlink a = new Hyperlink(activite);
	    	grid.add(a, 0, i);
	    	i++;
	       }
	      gettext.getInstance().getPane().setContent(grid);
	      for (i=0;i<grid.impl_getRowCount();i++)
		  	{
		  		links.add((Hyperlink) grid.getChildren().get(i));
		  	}
		  // la suppression de l'activité quand on clique sur le hyper link
		  	for (Hyperlink h : links)
		  	{
		  	   h.setOnAction(new EventHandler<ActionEvent>(){
		            @Override
		                  public void handle(ActionEvent arg0) {
		                 System.out.println("clicked");
		    	          gestion.ValiderSuppression(h.getText(), 4);
		    	          h.setVisible(false);
		    	          try {
								acceuil=new Acceuil();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                 }
		      
		    
		 		   });
		  	}
	     }  //ENDIF
		if(ChoixControler.selectedDomaine.equals("cinq"))
		{  
	      liste_activite.addAll(gestion.Acceuil(5));
	      for(String activite : liste_activite)
	      {
	    
	    	gettext.getInstance().getPane().setText("Bien-être");
	    	Hyperlink a = new Hyperlink(activite);
	    	grid.add(a, 0, i);
	    	i++;
	       }
	      gettext.getInstance().getPane().setContent(grid);
	      for (i=0;i<grid.impl_getRowCount();i++)
		  	{
		  		links.add((Hyperlink) grid.getChildren().get(i));
		  	}
		  // la suppression de l'activité quand on clique sur le hyper link
		  	for (Hyperlink h : links)
		  	{
		  	   h.setOnAction(new EventHandler<ActionEvent>(){
		            @Override
		                  public void handle(ActionEvent arg0) {
		                 System.out.println("clicked");
		    	          gestion.ValiderSuppression(h.getText(), 5);
		    	          h.setVisible(false);
		    	          try {
								acceuil=new Acceuil();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                 }
		      
		    
		 		   });
		  	}
	     }  //ENDIF
	
	  	
	  	
	  
			
			
	  	
	
		
	  
	  	

		
		
}
	
	
}
