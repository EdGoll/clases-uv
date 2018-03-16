import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame implements ActionListener {
	
	private Container cont;
	private JButton guerrero = new JButton("Guerrero");
	private JButton mago = new JButton("Mago");
	private JTable danioRealizado;
	private JTable danioRecibido;
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel(new GridLayout(1,2));
	private JPanel panel3 = new JPanel(new GridLayout(1,2));
	FuenteDeDatos archivo = new FuenteDeDatos();
	
	public Pantalla() {
		super("Datos de Combate");
		cont = getContentPane();
		cont.add(panel1);
		panel1.setLayout(new GridLayout(2,1));
		panel1.add(panel2);
		panel1.add(panel3);
		panel2.add(guerrero);
		panel2.add(mago);
		
		//arreglos para los table
		String[] titulo = {"personaje", "Tipo de ataque", "daño realizado"};
		String[][] info = {{"mago","llamarada","20"}};
		danioRealizado = new JTable(info,titulo);
		danioRecibido = new JTable(info,titulo);
		panel3.add(danioRealizado);
		panel3.add(danioRecibido);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
