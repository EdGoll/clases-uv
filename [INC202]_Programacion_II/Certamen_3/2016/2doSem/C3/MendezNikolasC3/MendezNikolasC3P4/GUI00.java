

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI00 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton CONVERT_T;
	private JTextArea T1 , T2;
	private JScrollPane BAR1, BAR2;
		
	public GUI00(){
		//set del frame
		setTitle("DECODIFICADOR MORSE/ASCCI");
		setComponet();
		setSize(700,430);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setComponet(){
		
		setLayout(null);
		// BOTON
		CONVERT_T = new JButton(">>"); 
		CONVERT_T.setBounds(301, 179, 49, 23);
		CONVERT_T.addActionListener(new ConvertListener());
		add(CONVERT_T);
		//TEXTAREA 
		T1 = new JTextArea();
		T1.setLineWrap(true);
		T2 = new JTextArea();
		T2.setEditable(false);
		T2.setLineWrap(true);
		//SCROLLPANE 
		BAR1 = new JScrollPane(T1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		BAR1.setBounds(30, 38, 621, 123);
		add(BAR1);
		BAR2 = new JScrollPane(T2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		BAR2.setBounds(30, 227, 621, 123);
		add(BAR2);
		//ETIQUETAS
		JLabel lblCodificado = new JLabel("CODIFICADO.");
		lblCodificado.setBounds(30, 13, 80, 14);
		add(lblCodificado);
		
		JLabel lblDecodificado = new JLabel("DECODIFICADO.");
		lblDecodificado.setBounds(30, 202, 97, 14);
		add(lblDecodificado);
		
	}

	class ConvertListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			T2.setText(" ");
			String linea=T1.getText();
			String txt;
			if(linea.charAt(0)=='.' || linea.charAt(0)=='-'){
				txt = toMORSE.toMorse(linea);
				T2.setText(toASCCI.toAscci(txt));
			}else{
				txt = toASCCI.toAscci(linea);
				T2.setText(toMORSE.toMorse(txt));
			}
		}
	}
	
}
