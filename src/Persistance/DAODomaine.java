package Persistance;

import java.sql.*;
import java.util.ArrayList;

import Metier.Domaine;

public class DAODomaine extends DAO{

	public DAODomaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Récupère tous les champs de la tables Domaine 
	public ArrayList<Domaine> getAll(){
		ArrayList<Domaine> dom = new ArrayList<>();
		try{
			//Create a statement
			Statement myStmt = this.cnx.createStatement();
			//Execute SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM Domaine");
			//Process the result set
			while(myRs.next()){
				dom.add(new Domaine(myRs.getInt("domaineId"),myRs.getString("nom"),myRs.getString("description"))); 
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		return dom;
	}

}
