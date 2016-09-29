package Persistance;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO {
Connection cnx = ConnexBD.getInstance();
	
	public abstract <T> ArrayList<T> getAll() ;

}
