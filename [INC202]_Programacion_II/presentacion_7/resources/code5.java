// ...
String id, nombre;
Date fecha;
int estado;
double saldo;
while (rs.next()) {
	// Se recupera cada columna por separado
	id = rs.getString("id"); 
	nombre = rs.getString("nombre"); 
	fecha = rs.getDate("fecha"); 
	estado = rs.getInt("estado");
	saldo = rs.getDouble("saldo");
	// Operacion que realizamos con cada fila
	System.out.println("ID: " + id + ", Nombre: " + nombre + ", Fecha: " + fecha);
}
// ...