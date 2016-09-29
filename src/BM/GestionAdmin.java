package BM;
import java.util.ArrayList;

import Metier.Administrateur;
import Persistance.DAOAdministrateur;


public class GestionAdmin {
	/*
	 * Utilise les résultats données par DAOAdministrateur 
	 * 
	 * 
	 */	
	//Fnction pour assurer l'authentification
	public boolean Athentifier(String pseudoName, String motDePasse){
		int res=0;
		DAOAdministrateur administrateur = new DAOAdministrateur();
        ArrayList<Administrateur> admin = new ArrayList<>();
        admin.addAll(administrateur.getAll());
        
        for(int i=0; i<admin.size(); i++){
        	if(admin.get(i).getPseudoName().equals(pseudoName)){
        		if(admin.get(i).getMotDePasse().equals(motDePasse)){
        			res=1;
        		}
        	}
        }
		if(res==0){
			return false;
		}
		else return true;
	}

}
