package DB_Connection;
import java.sql.DriverManager;

public class Connexion {
	//Connexion avec la base de donnée gestionblogs
	java.sql.Connection con; 
	private static final String URL = "jdbc:mysql://localhost:3306/gestionblogs";
    private static final String USER = "root";
    private static final String PASSWORD = "";
	public Connexion()
	{
		try {
			//Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(URL, USER, PASSWORD);
			
			System.out.println("Connexion à la base de données établie avec succès !");
		
		} catch (Exception e) {
			
		
			System.err.println("Échec de la connexion à la base de données : " + e.getMessage());
		}
	}
	public java.sql.Connection etablirconnection() {
		return con;
	}
	

}
