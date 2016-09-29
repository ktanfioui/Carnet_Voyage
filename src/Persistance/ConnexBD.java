package Persistance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexBD {


		private static final String dburl = "jdbc:mysql://localhost:3306/carnetVoyage";
		private static final String user = "root";
		private static final String password = "login";
		
		private static Connection myConn = null;	
		
		
		public static Connection getInstance() {
			if(myConn == null)
				try {
					myConn = DriverManager.getConnection(dburl,user , password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			return myConn;
		}


}
