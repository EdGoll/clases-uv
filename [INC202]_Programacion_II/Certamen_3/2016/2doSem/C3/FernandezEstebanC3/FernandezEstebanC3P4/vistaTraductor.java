import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class vistaTraductor extends JFrame {
    
    private JButton btn0, btn1, btn2, btn3, btn4;
    private JTextField in1, in2, in3, in4, out1, out2, out3, out4;
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, r1, r2, r3, r4;
    
    public vistaTraductor(){
        super("TRADUCTOR");
        setLayout(new GridLayout(5, 5, 2, 2));
        setSize(1050,220);
        setResizable(true);
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void init(){
    
        in1 = new JTextField(20);
        in2 = new JTextField(20);
        in3 = new JTextField(20);
        in4 = new JTextField(20);
        out1 = new JTextField(20);
        out2 = new JTextField(20);
        out3 = new JTextField(20);
        out4 = new JTextField(20);
        
        out1.setEditable(false);
        out2.setEditable(false);
        out3.setEditable(false);
        out4.setEditable(false);
        
        btn0 = new JButton("LIMPIAR");
        btn1 = new JButton("ASCII~MORSE");
        btn2 = new JButton("MORSE~ASCII");
        btn3 = new JButton("ASCII~TEXTO");
        btn4 = new JButton("TEXTO~MORSE");
        
        btn0.addActionListener(new oyenteBoton0());
        btn1.addActionListener(new oyenteBoton1());
        btn2.addActionListener(new oyenteBoton2());
        btn3.addActionListener(new oyenteBoton3());
        btn4.addActionListener(new oyenteBoton4());
        
        l1 = new JLabel("TRADUCTOR");
        l2 = new JLabel("Entrada ASCII");
        l3 = new JLabel("Salida MORSE");
        l4 = new JLabel("Entrada MORSE");
        l5 = new JLabel("Salida ASCII");
        l6 = new JLabel("Entrada ASCII");
        l7 = new JLabel("Salida TEXTO");
        l8 = new JLabel("Entrada TEXTO");
        l9 = new JLabel("Salida MORSE");
        r1 = new JLabel();
        r2 = new JLabel();
        r3 = new JLabel();
        r4 = new JLabel();
        
        add(r1);
        add(r2);
        add(btn0);
        add(r3);
        add(r4);
        add(l2);
        add(in1);
        add(btn1);
        add(l3);
        add(out1);
        add(l4);
        add(in2);
        add(btn2);
        add(l5);
        add(out2);
        add(l6);
        add(in3);
        add(btn3);
        add(l7);
        add(out3);
        add(l8);
        add(in4);
        add(btn4);
        add(l9);
        add(out4);   
    }
    
    class oyenteBoton0 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            in1.setText(""); in2.setText(""); in3.setText(""); in4.setText("");
            out1.setText(""); out2.setText(""); out3.setText(""); out4.setText("");
        }
    }
    
    
    class oyenteBoton1 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            asciiToText att = new asciiToText();
            textToMorse ttm = new textToMorse();
            if(in1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe incluir un texto antes de Traducir", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else{
                String temp = (att.AtoT(in1.getText()));
                out1.setText(ttm.textToMorse(temp));
            }
        }
    }
    
    class oyenteBoton2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            morseToText mtt = new morseToText();
            textToAscii tta = new textToAscii();
            if(in2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe incluir un texto antes de Traducir", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else{
                String temp = (mtt.MtoT(in2.getText()));
                out2.setText(tta.textToAscii(temp));
            }
        }
    }
    
    class oyenteBoton3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            asciiToText att = new asciiToText();
            if(in3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe incluir un texto antes de Traducir", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else{
                out3.setText(att.AtoT(in3.getText()));
            }
        }
    }
    
    class oyenteBoton4 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textToMorse ttm = new textToMorse();
            if(in4.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Debe incluir un texto antes de Traducir", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                out4.setText(ttm.textToMorse(in4.getText()));  
            }
        }
    }
}