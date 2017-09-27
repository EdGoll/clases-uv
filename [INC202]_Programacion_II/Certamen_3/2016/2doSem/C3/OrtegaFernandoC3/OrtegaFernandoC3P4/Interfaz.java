

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Interfaz extends JFrame {
    private JLabel lbltexto,lblmorse,lblscc,lblcodigo;
    private JTextField txtTexto,txtMorse,txtScc,txtcodigo;
    private JButton transformar;
    private String texto="as";
    
 
    
    public Interfaz(){
        
        super("traductor");
        setSize(1000,70);
        ventana();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    private void ventana() {
        lblcodigo = new JLabel("Codigo");
        lbltexto = new JLabel("texto");
        lblmorse = new JLabel("morse");
        lblscc = new JLabel("ASCII");
        transformar = new JButton("Transformar");
        transformar.addActionListener(new transformar());
        txtcodigo = new JTextField(12);
        txtTexto = new JTextField(12);
        txtMorse = new JTextField(12);
        txtScc = new JTextField(12);
        setLayout(new FlowLayout());
        
        add(lblcodigo);
        add(txtcodigo);
        add(transformar);
        add(lbltexto);
        add(txtTexto);
        add(lblmorse);
        add(txtMorse);
        add(lblscc);
        add(txtScc);
        setVisible(true);
        
    }

    class transformar implements ActionListener {
        private String texto="";
        private String mas;
        private String humano,morse,cosa;
        private char otro;
        private boolean ok;
        int u=0,q,p,j=1,y=0;
       
        @Override
        public void actionPerformed(ActionEvent e) {
            morsehumano mh = new morsehumano();
            humanomorse hm = new humanomorse();
            Robot r = new Robot();
            Robotmorse rm = new Robotmorse();
            ValidadorLetrasRustico vr = new ValidadorLetrasRustico();
            
            if(txtcodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "espacio vacio", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                texto = txtcodigo.getText();
            }
            mas = texto.substring(0,1);
            if(mas.equals("-")|| mas.equals(".")){//ingreso a conversor de texto
                for(int m=0; m<texto.length();m++){
                    if(texto.charAt(m)!='-'&&texto.charAt(m)!='.'&&texto.charAt(m)!=' '){//verificador 
                        y=1;
                    }
                }
                if(y==0){
                    humano = mh.traductor(texto);
                    txtTexto.setText(humano);
                    txtMorse.setText(texto);
                    cosa = r.letras(humano);
                    txtScc.setText(cosa);
                }else{
                    JOptionPane.showMessageDialog(null, "Ingreso un caracter no valido", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
                y=0;
            }else if(mas.equals("&")){//ingreso a conversor ASCII
                if(texto.length()<4){
                    y=1;
                }
                q = Character.getNumericValue(texto.charAt(2));
                p = Character.getNumericValue(texto.charAt(3));
                    if(texto.charAt(1)!='#'||q<4||(q==6&&p<5)||(q==5&&p>7)||(q==4&&p<8)||(q==9&&p>0)||texto.charAt(4)!=';'){//verificador de codigo(solo primera letra/numero
                            y=1;
                    }
                if(y==0){
                    morse = rm.traductor(texto);
                    txtMorse.setText(morse);
                    humano = mh.traductor(morse);
                    txtTexto.setText(humano);
                    txtScc.setText(texto);
                }
                if(y==1){
                    JOptionPane.showMessageDialog(null, "Codigo no valido", "ERROR",JOptionPane.ERROR_MESSAGE);
                }
                y=0;
            }else if(vr.letras(texto) !="no"){//ingreso al conersor TXT y verificador de minusculas y letras
                u=0;
                for(int i=0;i<texto.length();i++){
                    
                    
                    while(texto.length()>(j)){//verificador de numeros mayores a 10
                        q = Character.getNumericValue(texto.charAt(j));
                        p = Character.getNumericValue(texto.charAt(j-1));
                        
                        if(q<10 && p<10){ 
                            y=1;
                        }
                        j++;
                    }
                    j=1;
                    if(y==1){
                        u=1;
                    }
                    if(texto.substring(i,i+1).equals("-")||texto.substring(i,i+1).equals(".")){
                        u=1;
                    }
                }
                
                if(u!=1){
                    morse =hm.letras(texto);
                    txtMorse.setText(morse);
                    txtTexto.setText(texto);
                    cosa = r.letras(texto);
                    txtScc.setText(cosa);
                }else{
                    JOptionPane.showMessageDialog(null, "La palabra posee un '-' o un '.' o contiene un numero mayor a '9'", "ERROR",JOptionPane.ERROR_MESSAGE);
                    u=0;
                }
            }else{
                JOptionPane.showMessageDialog(null, "La palabra posee caracteres no validos o contiene minusculas", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    
    }
}
