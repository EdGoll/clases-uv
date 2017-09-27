import java.awt.event.*;
import javax.swing.*;

class VenJuego extends JFrame {
	public VenJuego(int caras){
		//addActionLWindowListener( new WindowAdapter() { /* Clase anonima */
		setSize(200,200);
		panJuego=new JuegoPanel(caras);
		getContentPane().add(panJuego);
	}
	public VenJuego(){
		//addActionLWindowListener( new WindowAdapter() { /* Clase anonima */
			setSize(200,200);
		panJuego=new JuegoPanel();
		getContentPane().add(panJuego);
	}private JPanel panJuego;
}

class JuegoPanel extends JPanel implements ActionListener{
	public JuegoPanel (int caras){
		dado = new Dado(caras);
		boton = new JButton("Lanzar Dado");
		add(boton);
		boton.addActionListener(this);
		label = new JLabel("El valor del dado "+dado.getValor());
		//label.setBounds(300,300,200,300);
		label1 = new JLabel("Numero de caras: "+caras);
		add(label1);
		add(label);
		}
	public JuegoPanel (){
		dado = new Dado();
		boton = new JButton("Lanzar Dado");
		add(boton);
		label = new JLabel("El valor del dado "+dado.getValor());
		label1 = new JLabel("Numero de caras: 6");
		add(label1);
		add(label);
		boton.addActionListener(this);}
		
		public void actionPerformed(ActionEvent event) {
				dado.lanzar();
				label.setText("El valor del dado "+Integer.toString(dado.getValor()));
			
		}private JButton boton;
		private Dado dado;
		private JLabel label, label1;
}
public class Juego {
	public static void main(String arg[]){
		JFrame ven;
		if (arg.length >= 1)
		ven= new VenJuego(Integer.parseInt(arg[0]));
		else 
		ven= new VenJuego();
		ven.setVisible(true);
		
	}}