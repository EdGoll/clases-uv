import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TraductorGUI extends JFrame {

    private JPanel panelTraduc, panelMorse, panelASCII, panelBtn;
    private JButton btn;
    private JTextField palabra, aAscii, aMorse;
    private JLabel plbr, ascii, morse;

    public TraductorGUI() {
        iniciarComponentes();
        pack();
        setSize(800, 200);
//        setResizable(false);
        setVisible(true);
        setLayout(new BorderLayout());
    }

    private void iniciarComponentes() {
        panelBtn = new JPanel();
        panelTraduc = new JPanel();
        panelASCII = new JPanel();
        panelMorse = new JPanel();
        btn = new JButton("Traducir");
        btn.addActionListener(new TraducirListener());
        plbr = new JLabel("Palabra a traducir: ");
        ascii = new JLabel("A ASCII: ");
        morse = new JLabel("A Morse: ");
        palabra = new JTextField(25);
        aAscii = new JTextField(50);
        aMorse = new JTextField(50);
        panelBtn.add(plbr);

        panelBtn.add(palabra);
        panelBtn.add(btn);
        add(panelBtn, BorderLayout.NORTH);
        panelMorse.add(morse);
        panelMorse.add(aMorse);

        panelASCII.add(ascii);
        panelASCII.add(aAscii);
        panelTraduc.add(panelMorse);
        panelTraduc.add(panelASCII);
        add(panelTraduc);

    }

    class TraducirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (palabra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No ha escrito ninguna palabra", "Alerta", JOptionPane.WARNING_MESSAGE);
            } else if (validarPalabra()) {
                if (hayMinusculas()) {
                    JOptionPane.showMessageDialog(null, "Las letras minusculas se traduciran como mayusculas", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
                aMorse.setText(Traducir.aMorse(palabra.getText().toUpperCase()));
                aAscii.setText(Traducir.aASCII(palabra.getText().toUpperCase()));
            } else {
                JOptionPane.showMessageDialog(null, "No se puede traducir la palabra", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private boolean validarPalabra() {
            boolean retorno = false;
            for (int i = 0; i < palabra.getText().length(); i++) {
                if (Character.isLetter(palabra.getText().charAt(i)) || Character.isDigit(palabra.getText().charAt(i)) || Character.isSpaceChar(palabra.getText().charAt(i))) {
                    retorno = true;
                } else {
                    retorno = false;
                }
            }
            return retorno;
        }
        
        private boolean hayMinusculas(){
            boolean retorno = false;
            for (int i = 0; i < palabra.getText().length(); i++) {
                if (Character.isLowerCase(palabra.getText().charAt(i))) {
                    retorno = true;
                    break;
                } else {
                    retorno = false;
                }
            }
            return retorno;
        }
    }
}
