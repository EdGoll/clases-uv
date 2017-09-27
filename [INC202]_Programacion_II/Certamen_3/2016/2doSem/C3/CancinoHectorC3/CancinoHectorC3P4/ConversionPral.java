import java.lang.Character.*;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ConversionPral extends JFrame implements ActionListener{
	/*
	private String[] letras =   {"A", "B"  ,  "C" , "D" ,"E",  "F" , "G" ,  "H" , "I",  "J" , "K" , "L"  ,"M" ,"N" , "O" ,  "P" ,"  Q" , "R" , "S" ,"T", "U" , "V"  , "W" ,  "X" , "Y"  , "Z"  ,  "0"  ,  "1"  ,  "2"  ,  "3"  ,  "4"  ,  "5"  ,  "6"  ,  "7"  ,  "8"  ,"9"};
	private String[] morse =   {"._","_...","_._.","_..",".",".._.","__.","....","..",".___","_._","._..","__","_.","___",".__.","__._","._.","...","_",".._","..._",".__","_.._","_.__","__..","_____",".____","..___","...__","...._",".....","_....","__...","___..","____."};
	private String[] ascci =  {"&#65;","&#66;","&#67;","&#68;","&#69;","&#70;","&#71;","&#72;","&#73;","&#74;","&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;","&#88;","&#89;","&#90;","&#48;","&#49;","&#50;","&#51;","&#52;","&#53;","&#54;","&#55;","&#56;","&#57;"};
	public char text [];
	*/
	JLabel etiNombre;
	JTextField txtNombre;
	JButton botonAscii,botonMorse,botonLetra;
	JPanel panel;
	

	public ConversionPral(){
		conversionPrincipal();
	}

	public void conversionPrincipal(){
		this.setTitle("CONVERSOR");
		panel = new JPanel();
		panel.setLayout(null);

		etiNombre = new JLabel("Ingrese caracter a convertir(ASCCI/ALFABETO/Morse)");
		etiNombre.setBounds(30,40,360,20);
		panel.add(etiNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(10,70,360,20);
		panel.add(txtNombre);

		botonAscii = new JButton("ASCCI");
		botonAscii.setBounds(40,110,90,20);
		botonAscii.addActionListener(this);
		panel.add(botonAscii);


		botonMorse = new JButton("Morse");
		botonMorse.setBounds(140,110,90,20);
		botonMorse.addActionListener(this);
		panel.add(botonMorse);

		botonLetra = new JButton("Alfabeto");
		botonLetra.setBounds(240,110,90,20);
		botonLetra.addActionListener(this);
		panel.add(botonLetra);
		add(panel);

		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==botonAscii){
			/*
			text =txtNombre.getText().toCharArray();
			for(int j = 0; j<text.length; j++){
				if(Character.isLowerCase(text[j])){
					JOptionPane.showMessageDialog(null, "Error texto debe estar en mayuscula","ERROR ",JOptionPane.ERROR_MESSAGE);			
				}
				if(txtNombre.getText().equals(" ")){
					JOptionPane.showMessageDialog(null, "Error texto no econtrado","ERROR ",JOptionPane.ERROR_MESSAGE);
				}
			}
			*/
			ConversionASCCI ascc = new ConversionASCCI();
			ascc.textousuario = txtNombre.getText();
			ascc.convertir();
			ascc.conversionASCxCI();
			
		}
		if(e.getSource()==botonMorse){
			/*
			text =txtNombre.getText().toCharArray();
			for(int j = 0; j<text.length; j++){
				if(Character.isLowerCase(text[j])){
					JOptionPane.showMessageDialog(null, "Error texto debe estar en mayuscula","ERROR ",JOptionPane.ERROR_MESSAGE);			
				}
				if(txtNombre.getText().equals(" ")){
					JOptionPane.showMessageDialog(null, "Error texto no econtrado","ERROR ",JOptionPane.ERROR_MESSAGE);
				}
			}
			*/	
			ConversionMorse mors = new ConversionMorse();
			mors.textousuario = txtNombre.getText();
			mors.convertir();
			mors.conversionMorsse();
			
		}
		if(e.getSource()==botonLetra){
			/*
			text =txtNombre.getText().toCharArray();
			for(int j = 0; j<text.length; j++){
				if(Character.isLowerCase(text[j])){
					JOptionPane.showMessageDialog(null, "Error texto debe estar en mayuscula","ERROR ",JOptionPane.ERROR_MESSAGE);			
				}
				if(txtNombre.getText().equals(" ")){
					JOptionPane.showMessageDialog(null, "Error texto no econtrado","ERROR ",JOptionPane.ERROR_MESSAGE);
				}
			}		
			*/
			ConversionLetras alt = new ConversionLetras();
			alt.textousuario = txtNombre.getText();
			alt.convertir();
			alt.conversionLetrass();

		}

	}
}