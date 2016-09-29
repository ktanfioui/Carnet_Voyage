package Metier;

import java.util.ArrayList;

public class Domaine {
	 private int domaineID;
	 
	   private String nom;
	   
	   private String description;
	   	   
	   public Domaine() {
		// TODO Auto-generated constructor stub
	}
	   
	   

	   
	public Domaine(int domaineID, String nom, String description) {
		super();
		this.domaineID = domaineID;
		this.nom = nom;
		this.description = description;
		}




	public int getDomaineID() {
		return domaineID;
	}

	public void setDomaineID(int domaineID) {
		this.domaineID = domaineID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	   
}
