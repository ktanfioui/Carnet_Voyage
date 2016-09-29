package Presentation.Controler;
import Presentation.View.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import BM.GestionAdmin;
public class logControler {
	
	/*
	 * Récupère les champ entrée dans les textFields et s'assure de la bonne authentification
	 * 
	 * 
	 */
	@FXML
	private Label lblstatus;
    @FXML
    private TextField username; private String user;
    @FXML
    private TextField pass; private String passw;
    private Acceuil acceuil; 
    private GestionAdmin gestion= new GestionAdmin();
    
    public void login(ActionEvent event) throws Exception
	{
		user=username.getText();
		passw=pass.getText();
		if(gestion.Athentifier(user, passw)==true)
		{
		
			acceuil=new Acceuil();
			  ((Node) event.getSource()).getScene().getWindow().hide();  
		}
		else
		{
			lblstatus.setText("Le login ou le mot de passe est erroné, réessayer");
		}
	}
   

}
