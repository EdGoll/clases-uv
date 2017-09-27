
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Las instrucciones no eran muy claras al momento de especificar que se pedía traducir, por lo que implementé los tres tipos de traducción en
//este programa

public class TrnsFrameMain extends JFrame
{
    private JPanel pnlMainNorth,pnlMainCenter,pnlMainSouth,pnlMainSouthEx,pnlMainSouthEx2;
    private JLabel lblDisclaimer,lblField1,lblField2,lblField3,lblFuente;
    private JTextField txtField1,txtField2,txtField3;
    private JButton btnTraducir,btnDeMorse,btnDeTexto,btnDeASCII;
    private Translator t;
    private int modo = 1;
    
    public TrnsFrameMain()
    {
        super("Traductor");
        showWindow();
        setSize(740,230);
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); //Centrar ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void showWindow()
    {
        pnlMainNorth = new JPanel();
        pnlMainCenter = new JPanel();
        pnlMainSouth = new JPanel();
        pnlMainSouthEx = new JPanel(new BorderLayout());
        pnlMainSouthEx2 = new JPanel();
        
        lblDisclaimer = new JLabel("Sólo se traducen números y letras MAYÚSCULAS");
        lblFuente = new JLabel("            De que fuente desea traducir:");
        lblField1 = new JLabel("                   Texto a traducir");
        lblField2 = new JLabel("                                      ASCII");
        lblField3 = new JLabel("                                    Morse");
        
        txtField1 = new JTextField(48);
        txtField2 = new JTextField(48);
        txtField2.setEditable(false);
        txtField3 = new JTextField(48);
        txtField3.setEditable(false);
        
        btnTraducir = new JButton("Traducir");
        btnTraducir.addActionListener(new TraducirListener());
        btnDeMorse = new JButton("De Morse");
        btnDeMorse.addActionListener(new DeMorseListener());
        btnDeTexto = new JButton("De Texto");
        btnDeTexto.addActionListener(new DeTextoListener());
        btnDeASCII = new JButton("De ASCII");
        btnDeASCII.addActionListener(new DeASCIIListener());
        
        pnlMainNorth.add(lblDisclaimer);
        
        pnlMainCenter.add(lblField1);
        pnlMainCenter.add(txtField1);
        pnlMainCenter.add(lblField2);
        pnlMainCenter.add(txtField2);
        pnlMainCenter.add(lblField3);
        pnlMainCenter.add(txtField3);
        
        pnlMainSouthEx.add(btnTraducir,BorderLayout.NORTH);
        pnlMainSouthEx2.add(btnDeTexto);
        pnlMainSouthEx2.add(btnDeMorse);
        pnlMainSouthEx2.add(btnDeASCII);
        pnlMainSouthEx.add(pnlMainSouthEx2,BorderLayout.SOUTH);
        pnlMainSouthEx.add(lblFuente,BorderLayout.CENTER);
        
        pnlMainSouth.add(pnlMainSouthEx);
        
        add(pnlMainNorth,BorderLayout.NORTH);
        add(pnlMainCenter,BorderLayout.CENTER);
        add(pnlMainSouth,BorderLayout.SOUTH);
        
    }
    
    class TraducirListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            t = new Translator();
            switch(modo)
            {
                case 1:
                {
                    txtField2.setText(t.TextToASCII(txtField1.getText()));
                    txtField3.setText(t.TextToMorse(txtField1.getText()));
                    break;
                }
                case 2:
                {
                    txtField2.setText(t.MorseToASCII(txtField1.getText()));
                    txtField3.setText(t.MorseToText(txtField1.getText()));
                    break;
                }
                case 3:
                {
                    txtField2.setText(t.ASCIIToText(txtField1.getText()));
                    txtField3.setText(t.ASCIIToMorse(txtField1.getText()));
                    break;
                }
            }
        }
    }
    
    class DeTextoListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            modo = 1;
            lblField1.setText("                   Texto a traducir");
            lblField2.setText("                                      ASCII");
            lblField3.setText("                                    Morse");
            txtField1.setText("");
            txtField2.setText("");
            txtField3.setText("");
        }
    }
    
    class DeMorseListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            modo = 2;
            lblField1.setText("                 Morse a traducir");
            lblField2.setText("                                      ASCII");
            lblField3.setText("                                    Texto");
            txtField1.setText("");
            txtField2.setText("");
            txtField3.setText("");
        }
    }
    
    class DeASCIIListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            modo = 3;
            lblField1.setText("                   ASCII a traducir");
            lblField2.setText("                                    Texto");
            lblField3.setText("                                    Morse");
            txtField1.setText("");
            txtField2.setText("");
            txtField3.setText("");
        }
    }
}
