


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Interfaz extends JFrame implements ActionListener{
		
		String textoOriginal ;
		String textoFinal ;
		private static final long serialVersionUID = 1L;
		private Container container = getContentPane();
		private JLabel tituloOriginal = new JLabel("TEXTO ORIGINAL");
		private JLabel tituloResult = new JLabel("TEXTO RESULTADO");
		private JScrollPane textOriginal = new JScrollPane();
		private JScrollPane textResult = new JScrollPane();
		private JTextArea original = new JTextArea();
		private JTextArea resultado = new JTextArea();
		private JButton convertir = new JButton("Convertir");
		private JLabel mensaje = new JLabel();
		
		
		
		public Interfaz(){
			pack();
			iniciar();
			setTitle("Programa Codificacion MORSE - ASCII");
			setSize(1000, 720);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		private void iniciar(){
			container.setLayout(null);
			tituloOriginal.setBounds(100, 10, 490, 20);
			tituloOriginal.setFont(new java.awt.Font("Arial",0,22));
			tituloResult.setBounds(650, 10, 475, 20);
			tituloResult.setFont(new java.awt.Font("Arial",0,22));
			textOriginal.setBounds(5, 40, 490, 500);
			original.setLineWrap(true);
			original.setWrapStyleWord(true);
			textOriginal.setViewportView(original);
			textResult.setBounds(500, 40, 475, 500);
			resultado.setLineWrap(true);
			resultado.setWrapStyleWord(true);
			textResult.setViewportView(resultado);
			convertir.setBounds(700, 600, 150, 30);
			convertir.addActionListener(this);
			mensaje.setBounds(390, 600, 400, 40);
			mensaje.setFont(new java.awt.Font("Arial",0,22));
			
			container.add(tituloOriginal);
			container.add(tituloResult);
			container.add(textOriginal);
			container.add(textResult);
			container.add(convertir);
			container.add(mensaje);
		}
		@Override
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==convertir){
				
				textoOriginal = original.getText();
				textoFinal ="ORIGINAL  :" + textoOriginal +"\n"+ ToASCII.toASCII(textoOriginal) + ToMorse.toMorse(textoOriginal); 	
				resultado.setText(textoFinal);
			}
		}
		

	

}
