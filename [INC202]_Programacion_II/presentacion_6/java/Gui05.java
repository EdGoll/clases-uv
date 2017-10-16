import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Gui05 extends JFrame{
	
	private JButton botonCopiar;
	private JTextField campoValor;
	private JTextField resultado;
	
	public Gui05(){
		super("Ejemplo Layout");
		setLayout(new FlowLayout());
		add(new JLabel(" Valor: "));
		campoValor = new JTextField(5);
		add(campoValor);
		botonCopiar = new JButton(" Copiar ");
		add(botonCopiar);
		botonCopiar.addActionListener(new OyenteBoton());
		add(new JLabel(" Copia "));
		resultado = new JTextField(6);
		add(resultado);
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Gui05 app = new Gui05();
	}
		
	class OyenteBoton implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e){
			String valor = campoValor.getText();
			resultado.setText(valor);
		}
	}

}

