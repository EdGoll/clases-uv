import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransformarView extends JFrame {

    private JTextField texto = new JTextField(32);
    private JButton boton = new JButton("Transformar");
    private JCheckBox aTexto = new JCheckBox("Texto"), aMorse = new JCheckBox("Morse"), aASCII = new JCheckBox("ASCII");
    private JPanel panelTexto = new JPanel(), panelOpciones = new JPanel(), panelResultado = new JPanel();
    private JLabel aTextoResultado = new JLabel(), aMorseResultado = new JLabel(), aASCIIResultado = new JLabel();

    public TransformarView() {
        super("Transformar");
    }

    public void inicio() {
        setLayout(new GridLayout(3, 1, 0, 0));

        panelTexto.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelTexto.add(texto);
        boton.addActionListener(new BotonListener());
        panelTexto.add(boton);

        panelOpciones.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        aTexto.setSelected(true);
        panelOpciones.add(aTexto);
        aMorse.setSelected(true);
        panelOpciones.add(aMorse);
        aASCII.setSelected(true);
        panelOpciones.add(aASCII);

        panelResultado.setLayout(new GridLayout(3, 2, 5, 5));
        panelResultado.add(new JLabel("A Texto: "));
        panelResultado.add(aTextoResultado);
        panelResultado.add(new JLabel("A Morse: "));
        panelResultado.add(aMorseResultado);
        panelResultado.add(new JLabel("A ASCII: "));
        panelResultado.add(aASCIIResultado);

        add(panelTexto);
        add(panelOpciones);
        add(panelResultado);

        setSize(530, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class BotonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (texto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un texto para transformar", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!aTexto.isSelected() && !aMorse.isSelected() && !aASCII.isSelected()) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una transformación", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (aTexto.isSelected()) {
                    aTextoResultado.setText(Transformar.aTexto(texto.getText().toUpperCase()));
                } else {
                    aTextoResultado.setText(" NO APLICA ");
                }
                if (aMorse.isSelected()) {
                    aMorseResultado.setText(Transformar.aMorse(texto.getText().toUpperCase()));
                } else {
                    aMorseResultado.setText(" NO APLICA ");
                }
                if (aASCII.isSelected()) {
                    aASCIIResultado.setText(Transformar.aASCII(texto.getText().toUpperCase()));
                } else {
                    aASCIIResultado.setText(" NO APLICA ");
                }
            }
        }
    }
}
