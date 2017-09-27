import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConversionLetras extends JFrame implements ActionListener{

	private String[] letras =   {"A", "B"  ,  "C" , "D" ,"E",  "F" , "G" ,  "H" , "I",  "J" , "K" , "L"  ,"M" ,"N" , "O" ,  "P" ,"  Q" , "R" , "S" ,"T", "U" , "V"  , "W" ,  "X" , "Y"  , "Z"  ,  "0"  ,  "1"  ,  "2"  ,  "3"  ,  "4"  ,  "5"  ,  "6"  ,  "7"  ,  "8"  ,"9"};
	private String[] morse =   {"._","_...","_._.","_..",".",".._.","__.","....","..",".___","_._","._..","__","_.","___",".__.","__._","._.","...","_",".._","..._",".__","_.._","_.__","__..","_____",".____","..___","...__","...._",".....","_....","__...","___..","____."};
	private String[] ascci =  {"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;","&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;","&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;","&#56;","&#57;"};
	public	String textousuario;
	public	String resultado;



	JTextArea txtLetra;
	JButton botonLetra;
	JPanel panel;

	public ConversionLetras(){

	}

	public void conversionLetrass(){
		
		
		this.setTitle("LETRA");
		panel = new JPanel();
		panel.setLayout(null);
		
		txtLetra = new JTextArea("Caracter Original : " + textousuario + "\nCaracter Traducido: " + resultado);
		txtLetra.setBounds(55,40,300,100);

		panel.add(txtLetra);

		botonLetra = new JButton("aceptar");
		botonLetra.setBounds(140,140,90,20);
		botonLetra.addActionListener(this);
		panel.add(botonLetra);



		add(panel);
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);



	}

	public void convertir(){

		for(int i=0; i<letras.length; i++){

			if(textousuario.equals(letras[i])){
				resultado = letras[i];
			}			
		}
		for(int i = 0; i<morse.length; i++){

			if(textousuario.equals(morse[i])){
				resultado = letras[i];

			}

		}
		for(int i = 0; i<ascci.length; i++){
			if(textousuario.equals(ascci[i])){
				resultado = letras[i];
			}
		}
	} 	

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==botonLetra){
			setVisible(false);
		}
	}
}