package Persistance;

import java.sql.*;
import java.util.ArrayList;

import Metier.Activite;

public class DAOActivite extends DAO{

	public DAOActivite() {
		super();
	}
	/*
	 * 
	 * Cette fonction récupère tous les champs dans la table activité de notre BD  
	 */
	public ArrayList<Activite> getAll(){
		ArrayList<Activite> act = new ArrayList<>();
		try{
			//Create a statement
			Statement myStmt = this.cnx.createStatement();
			//Execute SQL query
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM Activite");
			//Process the result set
			while(myRs.next()){
				act.add(new Activite(myRs.getInt("activiteId"),myRs.getString("nom"),myRs.getString("description"),myRs.getFloat("cout"),myRs.getInt("maxUtilisateur"),myRs.getInt("domaineId")));
			}
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		return act;
	}
	//Ajoute une activité dans la base de donnée 
	public void ajouter(Object o) {
		Activite act = (Activite) o;
		
		try{
			//Create a statement
			Statement myStmt = this.cnx.createStatement();
			
			//Execute SQL query
			String sql = "insert into Activite " + " (activiteId,nom,description,cout,maxUtilisateur,domaineId)"
                + " values ("+act.getActiviteID()+",'"+act.getNom()+"','"+act.getDescription()+"','"+act.getCout()+"','"+act.getMaxUtilisateur()+"',"+act.getDomaineID()+")";
       
		myStmt.executeUpdate(sql);
        
		}
        catch(Exception exc) {
            exc.printStackTrace();
            }
	}
	//Supprime une activité de la base de donnée 
	public void supprimer(Object o) {
		Activite act = (Activite) o;
		
		try{
			//Create a statement
			Statement myStmt = this.cnx.createStatement();
			
			//Execute SQL query
			String sql = "DELETE FROM Activite where nom='"+act.getNom()+"' and domaineId='"+act.getDomaineID()+"'";
		myStmt.executeUpdate(sql);
        
		}
        catch(Exception exc) {
            exc.printStackTrace();
            }
	}
	
	//Modifie les champs d'une activité 
	public void modifier(Object o){
		Activite act = (Activite) o;
		try{
			//Create a statement
			Statement myStmt = this.cnx.createStatement();
			
			//Execute SQL query
			String sql = "UPDATE Activite SET nom='"+act.getNom()+"' , description='"+act.getDescription()+"' , cout='"+act.getCout()+"' , maxUtilisateur='"+act.getMaxUtilisateur()+"' , domaineID='"+act.getDomaineID()+"' where activiteId='"+act.getActiviteID()+"'";
		myStmt.executeUpdate(sql);
        
		}
        catch(Exception exc) {
            exc.printStackTrace();
            }
	}
	

}
