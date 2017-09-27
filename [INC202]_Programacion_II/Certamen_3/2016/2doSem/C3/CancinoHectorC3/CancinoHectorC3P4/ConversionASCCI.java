import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConversionASCCI extends JFrame implements ActionListener{

	private String[] letras =   {"A", "B"  ,  "C" , "D" ,"E",  "F" , "G" ,  "H" , "I",  "J" , "K" , "L"  ,"M" ,"N" , "O" ,  "P" ,"  Q" , "R" , "S" ,"T", "U" , "V"  , "W" ,  "X" , "Y"  , "Z"  ,  "0"  ,  "1"  ,  "2"  ,  "3"  ,  "4"  ,  "5"  ,  "6"  ,  "7"  ,  "8"  ,"9"};
	private String[] morse =   {"._","_...","_._.","_..",".",".._.","__.","....","..",".___","_._","._..","__","_.","___",".__.","__._","._.","...","_",".._","..._",".__","_.._","_.__","__..","_____",".____","..___","...__","...._",".....","_....","__...","___..","____."};
	private String[] ascci =  {"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;","&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;","&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;","&#56;","&#57;"};
	public	String textousuario;
	public	String resultado;



	JTextArea txtASCCI;
	JButton botonAscii;
	JPanel panel;

	public ConversionASCCI(){

	}


	public void conversionASCxCI(){

				
		this.setTitle("ASCCI");
		panel = new JPanel();
		panel.setLayout(null);


		txtASCCI = new JTextArea("Caracter Original : " + textousuario + "\nCaracter Traducido: " + resultado);
		txtASCCI.setBounds(55,40,300,100);
		panel.add(txtASCCI);

		botonAscii = new JButton("aceptar");
		botonAscii.setBounds(140,140,90,20);
		botonAscii.addActionListener(this);
		panel.add(botonAscii);

		

		add(panel);
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);



	}

	public void convertir(){
		resultado = "";
		for(int i=0; i<letras.length; i++){

			if(textousuario.contains(letras[i])){
				resultado += ascci[i];
			}			
		}
		for(int i = 0; i<morse.length; i++){

			if(textousuario.contains(morse[i])){
				resultado += ascci[i];

			}

		}
		for(int i = 0; i<ascci.length; i++){
			if(textousuario.contains(ascci[i])){
				resultado += ascci[i];
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==botonAscii){
			setVisible(false);
		}	
	}
}