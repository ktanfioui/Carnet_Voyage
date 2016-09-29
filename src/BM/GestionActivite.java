package BM;
import Persistance.DAOActivite;
import java.util.ArrayList;
import java.util.Collection;

import Metier.Activite;
/*
 * Utilise les résultats données par DAOActivité 
 * 
 * 
 */
public class GestionActivite {
	//Récupère les activités de chaque domaine dans un ArrayList
	public ArrayList<String> Acceuil(int domaineId){
		
		DAOActivite activite = new DAOActivite();
        ArrayList<Activite> act = new ArrayList<>();
        act.addAll(activite.getAll());
        ArrayList<String> res = new ArrayList<>();
        for(int i=0; i<act.size(); i++){
        	if(act.get(i).getDomaineID()==domaineId){
        		res.add(act.get(i).getNom());
        	}
        }
		return res;
	}
	//récupère les informations de l'activité dont le nom est lui est passé en argument
	public ArrayList<Activite> DesActivite (String nom)
	{
		DAOActivite activ = new DAOActivite();
        ArrayList<Activite> act = new ArrayList<>();
        ArrayList<Activite> cible=new ArrayList<>();
        act.addAll(activ.getAll());
        for (Activite e : act)
        {
        	if (e.getNom().equals(nom))
        			{
        		     cible.add(e); 
        			}
        }
        
         return cible;
	}
	//Ajouter activité 
	public void ValiderAjout(String nom, String description, float cout, int maxUtilisateur, int domaineID){
		DAOActivite activite = new DAOActivite();
		Activite act = new Activite(nom,description,cout,maxUtilisateur,domaineID);
		activite.ajouter(act);
	}
	//supprimer activité 
	public void ValiderSuppression(String nom, int domaineID){
		DAOActivite activite = new DAOActivite();
		Activite act = new Activite(nom,domaineID);
		activite.supprimer(act);
		
	}
	//Modifier
	public void ValiderModification(int activiteId, String nom, String description, float cout, int maxUtilisateur, int domaineID){
		DAOActivite activite = new DAOActivite();
		Activite act = new Activite(activiteId,nom,description,cout,maxUtilisateur,domaineID);
		activite.modifier(act);
		
	}
	/*public static void main(String[] args) {
		GestionActivite a = new GestionActivite();
				a.ValiderSuppression("Location de Chambre", 1);
				a.DesActivite("location de villa");
				System.out.println(a.DesActivite("location de villa").get(0).getActiviteID());
				a.ValiderModification(4, "kljh", "gds", 12, 2, 1);
				
	}*/
	
	
	

}
