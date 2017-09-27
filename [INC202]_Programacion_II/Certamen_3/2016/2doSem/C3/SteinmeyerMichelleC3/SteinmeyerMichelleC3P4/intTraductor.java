
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class intTraductor extends JFrame {
    private JButton Boton1,Boton4;
    private JButton Boton2,Boton3; 
    private JLabel texto1, texto2,texto3,texto4;//,texto5,texto6;
    private JTextField campo1, campo2, campo3, campo4,campo5,campo6,campo7,campo8;
    
    public intTraductor(){        
        super("Traductor");
        setLayout(new GridLayout(4,4,3,10));
        inter(); 
        setSize(500,500);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void inter(){
        texto1 = new JLabel("Morse a ASCII");
        texto2 = new JLabel("ASCII a Morse");
        texto3 = new JLabel("Morse a Texto");
        texto4 = new JLabel("ASCII a Texto");
        Boton1 = new JButton("Traducir");
        Boton2 = new JButton("Traducir");
        Boton3 = new JButton("Traducir");
        Boton4 = new JButton("Traducir");
        Boton1.addActionListener(new Moas());
        Boton2.addActionListener(new Asmo());
        Boton3.addActionListener(new Mote());
        Boton4.addActionListener(new Aste());
        campo1 = new JTextField(15);
        campo2 = new JTextField(15);
        campo3 = new JTextField(15);
        campo4 = new JTextField(15);
        campo5 = new JTextField(15);
        campo6 = new JTextField(15);
        campo7 = new JTextField(15);
        campo8 = new JTextField(15);
        
        add(texto1);
        add(texto2);
        add(texto3);
        add(texto4);
        add(campo1);
        add(campo2);
        add(campo3);
        add(campo4);
        add(Boton1);
        add(Boton2);
        add(Boton3);
        add(Boton4);
        add(campo5);
        add(campo6);        
        add(campo7);
        add(campo8);
    }
    


    class Moas implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            TraductorMote M = new TraductorMote();
            TraductorTeas T = new TraductorTeas();
            if(campo1.getText().equals("")){
                JOptionPane.showMessageDialog(null,
                        "Error", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else{
                String A = (M.Mote(campo1.getText()));
                campo5.setText(T.Teas(A));
            }
        }

    }


     class Asmo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            TraductorAste m = new TraductorAste();
            TraductorTemo t = new TraductorTemo();
            if(campo2.getText().equals("")){
                JOptionPane.showMessageDialog(null,
                        "Error", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            else{
                String b =  m.Aste(campo2.getText());
                campo6.setText(t.Temo(b));
            }
         }    
    }
    
    class Mote implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            TraductorMote T = new TraductorMote();
            if(campo3.getText().equals("")){
                JOptionPane.showMessageDialog(null,
                        "Error", 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            else{
                campo7.setText(T.Mote(campo3.getText()));
            }
        }

    }

    class Aste implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            TraductorAste T = new TraductorAste();
            if(campo4.getText().equals("")){
                JOptionPane.showMessageDialog(null, 
                        "Error", 
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                
            }
            else{
                campo8.setText(T.Aste(campo4.getText()));
            }
        }

    }
}