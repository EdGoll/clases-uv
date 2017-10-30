package modelo.dao.conexion;
import java.sql.Connection;

import javax.swing.JOptionPane;

import modelo.dao.CargarDao;

public class ProbarConexion2 {
	private Connection cn=null;
	private Conexion conexion=null;
	public ProbarConexion2() {

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
		new ProbarConexion2();
		CargarDao cargar = new CargarDao();
		cargar.cargarDatos();
	}

}
