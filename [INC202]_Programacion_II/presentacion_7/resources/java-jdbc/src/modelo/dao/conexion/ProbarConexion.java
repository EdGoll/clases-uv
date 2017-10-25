package modelo.dao.conexion;
import java.sql.Connection;

import javax.swing.JOptionPane;

import modelo.dao.CargarDao;

public class ProbarConexion {
	private Connection cn=null;
	private Conexion conexion=null;
	public ProbarConexion() {

		try{
			conexion = new Conexion();
			cn = conexion.conectar();
			if (cn != null) {
				System.out.println("Conectado");
				JOptionPane.showMessageDialog(null, "Conectado");
			}
		}finally{
			conexion.cerrarConexion();
		}
	}
	
	
	public static void main(String[] args){
		new ProbarConexion();
		CargarDao cargar = new CargarDao();
		cargar.cargarDatos();
	}

}
