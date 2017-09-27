package c3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TranslatorView extends JFrame {

    private JTextArea texto, morse;
    private JButton texto2morse, morse2texto, limpiar;
    private JPanel panelTitulo, panelTexto, panelBotones, panelMorse, panelLimpiar;
    private JScrollPane scrollPaneTexto, scrollPaneMorse;

    public TranslatorView() {
        super("Herramienta de transformación");
        initialComponent();
    }

    private void initialComponent() {

        texto = new JTextArea(10, 15);
        morse = new JTextArea(10, 15);
        texto2morse = new JButton(">");
        morse2texto = new JButton("<");
        limpiar = new JButton("Limpiar");
        panelTitulo = new JPanel();
        panelTexto = new JPanel();
        panelBotones = new JPanel();
        panelMorse = new JPanel();
        panelLimpiar = new JPanel();
        scrollPaneTexto = new JScrollPane(texto);
        scrollPaneMorse = new JScrollPane(morse);

        setLayout(new BorderLayout());

        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitulo.add(new JLabel("Tranformación"));
        add(panelTitulo, BorderLayout.NORTH);

        panelTexto.setLayout(new BorderLayout(10, 10));
        panelTexto.add(new JLabel("Ingrese texto"), BorderLayout.NORTH);
        panelTexto.add(scrollPaneTexto, BorderLayout.CENTER);
        add(panelTexto, BorderLayout.WEST);

        panelBotones.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 40));
        texto2morse.addActionListener(new OyenteTexto2Morse());
        panelBotones.add(texto2morse, BorderLayout.NORTH);
        morse2texto.addActionListener(new OyenteMorse2Texto());
        panelBotones.add(morse2texto, BorderLayout.SOUTH);
        add(panelBotones, BorderLayout.CENTER);

        panelMorse.setLayout(new BorderLayout(10, 10));
        panelMorse.add(new JLabel("Ingrese código morse"), BorderLayout.NORTH);
        panelMorse.add(scrollPaneMorse, BorderLayout.CENTER);
        add(panelMorse, BorderLayout.EAST);

        panelLimpiar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        limpiar.addActionListener(new OyenteLimpiar());
        panelLimpiar.add(limpiar);
        add(panelLimpiar, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class OyenteTexto2Morse implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            morse.setText(TranslatorHelper.text2morse(texto.getText()));
        }
    }

    class OyenteMorse2Texto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setText(TranslatorHelper.morse2text(morse.getText()));
        }
    }

    class OyenteLimpiar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setText("");
            morse.setText("");
        }
    }

    public static void main(String[] args) {
        TranslatorView view = new TranslatorView();
    }
}
