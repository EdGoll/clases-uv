package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class PersonaDAOJdbc implements PersonaDAOInterface{
	List<Persona> listaPersona = new ArrayList<Persona>();

	public Persona crearPersona(Persona nuevoRegistro) {
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
		return nuevoRegistro;
	  
	}
	
	public void eliminarPersona(Persona elimRegistro) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.conectar();
		String sql = "DELETE FROM \"Persona\" WHERE id = ?";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setInt(1, elimRegistro.getId());
			preparedStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}		
	}
	
	public void actualizarPersona(Persona actRegistro) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.conectar();
		String sql = "UPDATE \"Persona\" "
				+ " SET id=?, edad=?, nivel_educacional=?, actividad=?,  renta_fija=?, lim_max_credito=?,deuda_actual=?," + 
				"porcent_uso_credito=?, num_compra_mes_actual=?, num_compra_mes_actual_1=?, num_compra_mes_actual_2=?," + 
				"num_compra_mes_actual_3=?,estado_actual=?, cant_hist_arasos_pago=?, compra=?"
				+ " WHERE id  = ?";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setInt(16, actRegistro.getId());
			preparedStmt.setInt(1, actRegistro.getId());
			preparedStmt.setInt(2, actRegistro.getEdad());
			preparedStmt.setString(3, actRegistro.getNivelEduc());
			preparedStmt.setString(4, actRegistro.getActividad());
			preparedStmt.setInt(5, actRegistro.getRentaFija());
			preparedStmt.setInt(6, actRegistro.getLimMaxCredito());
			preparedStmt.setInt(7, actRegistro.getDeudaActual());
			preparedStmt.setDouble(8, actRegistro.getPorcentUsoCredito());
			preparedStmt.setInt(9, actRegistro.getNumCompraMesActual());
			preparedStmt.setInt(10, actRegistro.getNumCompraMesActual_1());
			preparedStmt.setInt(11, actRegistro.getNumCompraMesActual_2());
			preparedStmt.setInt(12, actRegistro.getNumCompraMesActual_3());
			preparedStmt.setString(13, actRegistro.getEstadoActual());
			preparedStmt.setInt(14, actRegistro.getCantHistAtrasosPago());
			preparedStmt.setString(15, actRegistro.getCompra());
			
			preparedStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
	}
	
	public Persona buscarPersona(int idPersona) {
		//Persona personas = null;
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
				p.setEdad(rs.getInt("edad"));
				p.setNivelEduc(rs.getString("nivel_educacional"));
				p.setActividad(rs.getString("actividad"));
				p.setRentaFija(rs.getInt("renta_fija")); 
				p.setLimMaxCredito(rs.getInt("lim_max_credito")); 
				p.setDeudaActual(rs.getInt("deuda_actual")); 
				p.setPorcentUsoCredito(rs.getInt("porcent_uso_credito")); 
				p.setNumCompraMesActual(rs.getInt("num_compra_mes_actual"));
				p.setNumCompraMesActual_1(rs.getInt("num_compra_mes_actual_1"));
				p.setNumCompraMesActual_2(rs.getInt("num_compra_mes_actual_2"));
				p.setNumCompraMesActual_3(rs.getInt("num_compra_mes_actual_3"));
				p.setEstadoActual(rs.getString("estado_actual"));
				p.setCantHistAtrasosPago(rs.getInt("cant_hist_arasos_pago"));
				p.setCompra(rs.getString("compra"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conexion.cerrarConexion();
		}
		return p;
	}
	

	public List<Persona> personas() {
		//Persona personas = null;
		 Persona p=null;
		 List<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = new Conexion();
		Connection conn = conexion.conectar();
		String sql = "select * from public.\"Persona\" order by id desc";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = conn.prepareStatement(sql);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {
				p = new Persona();
				p.setId(rs.getInt("id"));
				p.setEdad(rs.getInt("edad"));
				p.setNivelEduc(rs.getString("nivel_educacional"));
				p.setActividad(rs.getString("actividad"));
				p.setRentaFija(rs.getInt("renta_fija")); 
				p.setLimMaxCredito(rs.getInt("lim_max_credito")); 
				p.setDeudaActual(rs.getInt("deuda_actual")); 
				p.setPorcentUsoCredito(rs.getInt("porcent_uso_credito")); 
				p.setNumCompraMesActual(rs.getInt("num_compra_mes_actual"));
				p.setNumCompraMesActual_1(rs.getInt("num_compra_mes_actual_1"));
				p.setNumCompraMesActual_2(rs.getInt("num_compra_mes_actual_2"));
				p.setNumCompraMesActual_3(rs.getInt("num_compra_mes_actual_3"));
				p.setEstadoActual(rs.getString("estado_actual"));
				p.setCantHistAtrasosPago(rs.getInt("cant_hist_arasos_pago"));
				p.setCompra(rs.getString("compra"));
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
