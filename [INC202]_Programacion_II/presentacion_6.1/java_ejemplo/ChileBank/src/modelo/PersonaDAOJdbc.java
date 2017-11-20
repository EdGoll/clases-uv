import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class PersonaDAOJdbc {
	List<Persona> listaPersona = new ArrayList<Persona>();

	public void crearPersona(Persona nuevoRegistro) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.conectar();
		String sqlInsertar = "INSERT INTO public.\"Persona\"" + 
				"(id, edad, nivel_educacional, actividad,  renta_fija, lim_max_credito," + 
				" deuda_actual, porcent_uso_credito, num_compra_mes_actual, num_compra_mes_actual_1," + 
				" num_compra_mes_actual_2, num_compra_mes_actual_3,estado_actual, cant_hist_arasos_pago, compra)" + 
				" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sqlInsertar);
			preparedStmt.setInt(1, nuevoRegistro.getId());
			preparedStmt.setInt(2, nuevoRegistro.getEdad());
			preparedStmt.setString(3, nuevoRegistro.getNivelEduc());
			preparedStmt.setString(4, nuevoRegistro.getActividad());
			preparedStmt.setInt(5, nuevoRegistro.getRentaFija());
			preparedStmt.setInt(6, nuevoRegistro.getLimMaxCredito());
			preparedStmt.setInt(7, nuevoRegistro.getDeudaActual());
			preparedStmt.setDouble(8, nuevoRegistro.getPorcentUsoCredito());
			preparedStmt.setInt(9, nuevoRegistro.getNumCompraMesActual());
			preparedStmt.setInt(10, nuevoRegistro.getNumCompraMesActual_1());
			preparedStmt.setInt(11, nuevoRegistro.getNumCompraMesActual_2());
			preparedStmt.setInt(12, nuevoRegistro.getNumCompraMesActual_3());
			preparedStmt.setString(13, nuevoRegistro.getEstadoActual());
			preparedStmt.setInt(14, nuevoRegistro.getCantHistAtrasosPago());
			preparedStmt.setString(15, nuevoRegistro.getCompra());
			preparedStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
	  
	}
	
	public void eliminarPersona(Persona p) {
		
	}
	
	public void actualizarPersona(Persona p) {
		
	}
	
	public Persona buscarPersona(int idPersona) {
		Persona personas = null;
		 Persona p=null;
		Conexion conexion = new Conexion();
		Connection conn = conexion.conectar();
		String sql = "select * from public.\"Persona\" where id = ?";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setInt(1, idPersona);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {
				p = new Persona();
				p.setId(rs.getInt("id"));
				p.setNivelEduc(rs.getString("nivel_educacional"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
		return personas;
	}
	

	public List<Persona> personas() {
		//Persona personas = null;
		 Persona p=null;
		 List<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = new Conexion();
		Connection conn = conexion.conectar();
		String sql = "select * from public.\"Persona\"";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sql);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {
				p = new Persona();
				p.setId(rs.getInt("id"));
				p.setNivelEduc(rs.getString("nivel_educacional"));
				personas.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
		return personas;
	}
	
	
	
}
