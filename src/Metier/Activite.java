package Metier;

public class Activite {
	private int activiteID;

	   private String nom;

	   private String description;

	   private float cout;

	   private int maxUtilisateur;

	   private int  domaineID;
	   
	    public Activite() {
			// TODO Auto-generated constructor stub
		}

	    

		public Activite( String nom, String description, float cout, int maxUtilisateur, int domaineID) {
			super();
			//this.activiteID = activiteID;
			this.nom = nom;
			this.description = description;
			this.cout = cout;
			this.maxUtilisateur = maxUtilisateur;
			this.domaineID = domaineID;
		}



		public Activite(String nom, int domaineID) {
			super();
			this.nom = nom;
			this.domaineID = domaineID;
		}



		public int getActiviteID() {
			return activiteID;
		}

		public void setActiviteID(int activiteID) {
			this.activiteID = activiteID;
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

		public float getCout() {
			return cout;
		}

		public void setCout(float cout) {
			this.cout = cout;
		}

		public int getMaxUtilisateur() {
			return maxUtilisateur;
		}

		public void setMaxUtilisateur(int maxUtilisateur) {
			this.maxUtilisateur = maxUtilisateur;
		}

		public int getDomaineID() {
			return domaineID;
		}

		public void setDomaineID(int domaineID) {
			this.domaineID = domaineID;
		}



		public Activite(int activiteID, String nom, String description, float cout, int maxUtilisateur, int domaineID) {
			super();
			this.activiteID = activiteID;
			this.nom = nom;
			this.description = description;
			this.cout = cout;
			this.maxUtilisateur = maxUtilisateur;
			this.domaineID = domaineID;
		}
	    
	    
}
