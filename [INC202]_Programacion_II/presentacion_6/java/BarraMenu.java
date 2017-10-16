import java.awt.Event;
import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BarraMenu extends JFrame{

	MenuBar barra = new MenuBar();	
	Menu programa = new Menu("Programa");
	Menu ayuda = new Menu("Ayuda");
	Menu guardar = new Menu("Guardar");

	
	public BarraMenu(){
	   super("Ventana en JAVA"); 
	   this.setSize(500, 500); 
	   
	   //barra
	   this.crearBarraMenu();
	   
	   //Tabs
	   this.crearTabs();
	   
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void crearBarraMenu(){
		   setMenuBar(barra);
		   barra.add(programa);
		   barra.add(ayuda);
		   programa.add("Nuevo");
		   programa.add("Abrir");
		   programa.addSeparator();
		   programa.add(guardar);
		   guardar.add("Guardar");
		   guardar.add("Guardar Como...");
		   guardar.add("Guardar Todo");
		   programa.addSeparator();
		   programa.add("Salir");
		   ayuda.add("Ayuda General");
		   ayuda.addSeparator();
		   ayuda.add("Acerca de...");		
	}
	
	private void crearTabs(){
	       JTabbedPane jtp = new JTabbedPane();
	       getContentPane().add(jtp);
	       JPanel jp1 = new JPanel();
	       JPanel jp2 = new JPanel();
	       JLabel label1 = new JLabel();
	       label1.setText("You are in area of Tab1");
	       JLabel label2 = new JLabel();
	       label2.setText("You are in area of Tab2");
	       jp1.add(label1);
	       jp2.add(label2);
	       jtp.addTab("Tab1", jp1);
	       jtp.addTab("Tab2", jp2);
	}
	
	public static void main(String args[]){
		BarraMenu prog = new BarraMenu();
	}

}//FIN DE LA CLASE Ventana
//FIN

