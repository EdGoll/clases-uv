package modelo.dao.conexion;
import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Persona;
import modelo.dao.CargarDao;
import modelo.dao.CargarDaoLog;

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
		//new ProbarConexion();
//		CargarDao cargar = new CargarDao();
//		cargar.cargarDatos();
		CargarDao cargar = new CargarDao();
		//cargar.cargarDatos();
		cargar.getSinDeuda();
		List<Persona> lista = cargar.getSinDeuda();
		for (Persona p : lista) {
			System.out.print(p.getId());
			System.out.println(p.getNivelEduc());
		}
	}

}
