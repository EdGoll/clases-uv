try {
	// ... 
	// Ejecutamos una sentencia SQL
	ResultSet rs = stmt.executeQuery("SELECT id, nombre, email, telefono FROM Contactos WHERE nombre LIKE '%pepe%'");
} catch (SQLException e) {
 	System.out.prinln(e);
}