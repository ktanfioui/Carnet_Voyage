package Presentation.Controler;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import BM.GestionActivite;
import Presentation.View.Acceuil;
import Presentation.View.*;
public class AjoutControler implements Initializable{

	
	@FXML
	private TextField name,price,maxuser,descri;
	@FXML
	private Label etat;
	private GestionActivite gestion = new GestionActivite();
	private Acceuil acceuil;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Pour ne pas touver un probl�me lors de l'instanciation
		gettext.getInstance().setTxt(name);
		gettext.getInstance().setTxt2(descri);
		gettext.getInstance().setTxt3(maxuser);
        gettext.getInstance().setTxt4(price);

	}
	//L'ajout dans la base de donn�e : 
	 public void ajouActiHandler(ActionEvent event) throws Exception
	 {
		 String n,d,u,c;
		 float co; int us;
		 n=gettext.getInstance().getTxt().getText();
		 d=gettext.getInstance().getTxt2().getText();
		 u=gettext.getInstance().getTxt3().getText();
		 c=gettext.getInstance().getTxt4().getText();
		 us=Integer.parseInt(u);
		 co=Float.parseFloat(c);
		 if(ChoixControler.selectedDomaine.equals("un"))
		 {
		 gestion.ValiderAjout(n, d, co, us,1);
		 etat.setText("Vous avez ajouter une activit� dans Hebergement");
		 acceuil=new Acceuil();
		 }
		 if(ChoixControler.selectedDomaine.equals("deux")){
		 gestion.ValiderAjout(n, d, co, us,2);
		 etat.setText("Vous avez ajouter une activit� dans Sport");
		 acceuil=new Acceuil();
		 }
		 if(ChoixControler.selectedDomaine.equals("trois")){ 
		 gestion.ValiderAjout(n, d, co, us,3);
		 etat.setText("Vous avez ajouter une activit� dans Restauration");
		 acceuil=new Acceuil();}
		 if(ChoixControler.selectedDomaine.equals("quatre")){ 
		 gestion.ValiderAjout(n, d, co, us,4);
		 etat.setText("Vous avez ajouter une activit� dans R�activit�");
		 acceuil=new Acceuil();}
		 if(ChoixControler.selectedDomaine.equals("cinq")){
		 gestion.ValiderAjout(n, d, co, us,5);
		 etat.setText("Vous avez ajouter une activit� dans Bien-�tre");
		 acceuil=new Acceuil();}
	}
	
	

}
