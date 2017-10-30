package modelo.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;

import modelo.Persona;
import modelo.dao.conexion.Conexion;

public class CargarDao {

	public void cargarDatos() {
		File archivo = null;
		FileReader fileReader = null;
		BufferedReader br = null;
		String linea=null;
		Persona persona = null;
		try {
			archivo = new File("dataset-chilebank.csv");
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				persona=this.getPersona(linea);
				this.crearRegistro(persona);
//		        while (st.hasMoreTokens()) {
//		        	palabra = st.nextToken();
//		            numTokens++;
//		            System.out.println ("    Palabra " + numTokens + " es: " + palabra);
//		        }
		        
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	private Persona getPersona(String linea) {
        StringTokenizer st = new StringTokenizer (linea,";");	 
        Persona nuevaPersona =  new Persona(Integer.valueOf(st.nextToken()),
        				   Integer.valueOf(st.nextToken()),
        				   st.nextToken(),st.nextToken(),
        				   Integer.valueOf(st.nextToken()),
        				   Integer.valueOf(st.nextToken()),
        				   Integer.valueOf(st.nextToken()),
			        		Double.parseDouble(st.nextToken()),
			        		Integer.valueOf(st.nextToken()),
			        		Integer.valueOf(st.nextToken()),
			        		Integer.valueOf(st.nextToken()),
			        		Integer.valueOf(st.nextToken()),
			        		st.nextToken(),
			        		Integer.valueOf(st.nextToken()),
			        		st.nextToken());
        return nuevaPersona;
	}
	
	private void crearRegistro(Persona nuevoRegistro) {
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

}
