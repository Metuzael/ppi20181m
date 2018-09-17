package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static Connection con = null;

	public static Connection getConnection() {
		try {
			if (con == null) {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/agenda_metuzael", "root", "lab02");
			}
			
			return con;

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
			
		}
		
    }
	
}


