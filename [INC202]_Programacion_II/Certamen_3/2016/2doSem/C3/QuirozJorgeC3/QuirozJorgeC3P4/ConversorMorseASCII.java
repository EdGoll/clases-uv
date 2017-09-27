import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ConversorMorseASCII extends JFrame{
	private String entradausuario;
	private JLabel texto, texto2, resultado, footer, footer2;
	private JButton procesarboton;
	private JTextField txtUser;
	private JTextArea txtResultado;
	private JScrollPane resultados;

	public ConversorMorseASCII(){
		super("Conversor Morse-ASCII v1.0");
		conversor();
		setSize(325,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void conversor(){
		texto = new JLabel("Ingrese letras mayusculas, codigo morse o ASCII");
		texto2 = new JLabel("para conocer su equivalencia");
		resultado = new JLabel("Conversion: ");
		procesarboton = new JButton("Convertir");
		procesarboton.addActionListener(new ConvertirListener());
		txtUser = new JTextField(15);
		txtResultado = new JTextArea(7,25);
		resultados = new JScrollPane(txtResultado);
		txtResultado.setText("Ingrese texto  \nLuego haga click en Convertir");
		txtResultado.setEditable(false);
		footer = new JLabel("Jorge Quiroz H.");
		footer2 = new JLabel("Programacion II - Ingenieria Civil Informatica UV");
		setLayout(new FlowLayout());
		add(texto);
		add(texto2);
		add(txtUser);
		add(procesarboton);
		add(resultado);
		add(resultados);
		add(footer);
		add(footer2);
		setVisible(true);
	}

	class ConvertirListener implements ActionListener {//inner class
		@Override
		public void actionPerformed(ActionEvent ae){//lo que ocurre al hacer clic
			entradausuario = txtUser.getText();
			if (entradausuario.equals(entradausuario.toUpperCase())){
			if (entradausuario.equals("")){
				JOptionPane.showMessageDialog(null, "Campo vacio","Error de entrada ",JOptionPane.ERROR_MESSAGE);
			}else{
				if(entradausuario.charAt(0)=='&'){
					ASCIItoStringandMorse A2SM = new ASCIItoStringandMorse(entradausuario);
					txtResultado.setText(A2SM.getResultado());
				}
				else{
					if(entradausuario.charAt(0)=='.'||entradausuario.charAt(0)=='-'){
						MorseToASCIIandString M2AS = new MorseToASCIIandString(entradausuario);
						txtResultado.setText(M2AS.getResultado());
					}
					else{
						StringToASCIIandMorse S2AM = new StringToASCIIandMorse(entradausuario);
						txtResultado.setText(S2AM.getResultado());
					}
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Utilice solo mayusculas","Error de entrada ",JOptionPane.ERROR_MESSAGE);
		}
	}
}

}