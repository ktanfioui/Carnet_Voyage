package Metier;

public class Administrateur {
	private int adminID;
	   
	   private String nom;
	   
	   private String prenom;
	   
	   private String pseudoName;
	   
	   private String motDePasse;
	   
	   public Administrateur() {
		// TODO Auto-generated constructor stub
		   setAdminID(0);
			setNom("");
			setPrenom("");
			setPseudoName("");
			setMotDePasse("");
	}

	   
	public Administrateur(String pseudoName2, String motDePasse2) {
		
		setPseudoName(pseudoName2);
		setMotDePasse(motDePasse2);
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudoName() {
		return pseudoName;
	}

	public void setPseudoName(String pseudoName) {
		this.pseudoName = pseudoName;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
