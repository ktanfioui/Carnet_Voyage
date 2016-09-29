package Persistance;

import java.sql.*;

import java.util.ArrayList;

import Metier.Administrateur;


public class DAOAdministrateur extends DAO{

	public DAOAdministrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * récupère tous les champs de la table Administrateur 
	 */
	public ArrayList<Administrateur> getAll(){
		ArrayList<Administrateur> admin = new ArrayList<>();
		try{
			//Create a statement
			Statement myStmt = this.cnx.createStatement();
			//Execute SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM Administrateur");
			//Process the result set
			while(myRs.next()){
				admin.add(new Administrateur(myRs.getString("pseudoName"),myRs.getString("motDePasse")));
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		return admin;
	}

}
