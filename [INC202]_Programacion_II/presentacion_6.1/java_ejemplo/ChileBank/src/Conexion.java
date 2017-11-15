
import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
	public String db = "chilebank";	
	public String port="5432";
	public String user = "postgres";
	public String pass = "adminadmin";
	public String url = "jdbc:postgresql://localhost:"+port+"/" + db;
	private Connection link = null;

	public Connection conectar() {
		// Ejemplo para PostgreSQL
		try {
			link = DriverManager.getConnection(this.url, this.user, this.pass);
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, ex);
			this.cerrarConexion();
		}
		return link;
	}
	
	public void cerrarConexion() {
		try {
			link.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
