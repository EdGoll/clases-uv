package Interfaz;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Tabla extends JFrame{

	
	
	public Tabla() {
		super("Datos de personajes");
		
		setLayout(new BorderLayout(10,10));
		add(new JButton("GUERRERO"),BorderLayout.EAST);
		add(new JButton("MAGO"), BorderLayout.WEST);		
		
		setSize(200, 10);		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
