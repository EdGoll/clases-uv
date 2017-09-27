

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Interfaz extends JFrame implements ActionListener{
    private JTextField morse,ASCII,texto;
    private JButton btn1;
    private JPanel pnl1,pnl2,pnl3;
    private JLabel eti1,eti2,eti3;
    public Interfaz(){
        super("Traduccion");
        setLayout(new BorderLayout());
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void vista(){
        morse= new JTextField(16);
        ASCII = new JTextField(16);
        texto = new JTextField(16);
        eti1= new JLabel("Ingrese Morse");
        eti2= new  JLabel("Traduccion ASCII");
        eti3 = new JLabel("Tradccion Texto");
        btn1 = new JButton("Traducir");
        pnl1 = new JPanel();
        pnl2= new JPanel();
        pnl3 = new JPanel();
        
        pnl1.add(eti1);
        pnl1.add(morse);
        pnl2.add(btn1);
        pnl3.add(eti2);
        pnl3.add(ASCII);
        pnl3.add(eti3);
        pnl3.add(texto);
        add(pnl1,BorderLayout.WEST);
        add(pnl2,BorderLayout.CENTER);
        btn1.addActionListener((this));
        add(pnl3,BorderLayout.EAST);
        texto.setEditable(false);
        ASCII.setEditable(false);
        setSize(1000,100);
        setVisible(true);
        
        
    }
    @Override
    final public void actionPerformed (ActionEvent e){
            String palabra;
            ASCII a= new ASCII();
            TMorse T = new TMorse();
           
            palabra = T.Decod(morse.getText());
            texto.setText(palabra);
            ASCII.setText(a.trad(palabra));
        
        }
        
        
    }
    
    

