package pe;

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

public class CuentaCorrienteView extends JFrame {

    private JTextArea textoAbono, textoGiro;
    private JButton accionAbono, accionGiro;
    private JPanel panelTitulo, panelAbono, panelGiro;
    private JScrollPane scrollPaneAbono, scrollPaneGiro;
    private final String TEXT_DETENER = "Detener";
    private final String TEXT_PROCESAR = "Procesar";
    private CuentaCorriente cc;
    private ThreadCuentaCorrienteDepositar tccd;
    private ThreadCuentaCorrienteGirar tccg;

    public CuentaCorrienteView() {
        super("Herramienta de información bancaria");
        initialComponent();
        startProccess();
    }

    private void initialComponent() {

        textoAbono = new JTextArea(10, 15);
        textoGiro = new JTextArea(10, 15);
        accionAbono = new JButton(TEXT_DETENER);
        accionGiro = new JButton(TEXT_DETENER);
        panelTitulo = new JPanel();
        panelAbono = new JPanel();
        panelGiro = new JPanel();
        scrollPaneAbono = new JScrollPane(textoAbono);
        scrollPaneGiro = new JScrollPane(textoGiro);

        setLayout(new BorderLayout());

        panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitulo.add(new JLabel("Información bancaria"));
        add(panelTitulo, BorderLayout.NORTH);

        panelAbono.setLayout(new BorderLayout(10, 10));
        panelAbono.add(new JLabel("    Abono    "), BorderLayout.NORTH);
        panelAbono.add(scrollPaneAbono, BorderLayout.CENTER);
        accionAbono.addActionListener(new OyenteAbono());
        panelAbono.add(accionAbono, BorderLayout.SOUTH);
        add(panelAbono, BorderLayout.WEST);

        panelGiro.setLayout(new BorderLayout(10, 10));
        panelGiro.add(new JLabel("    Giro    "), BorderLayout.NORTH);
        panelGiro.add(scrollPaneGiro, BorderLayout.CENTER);
        accionGiro.addActionListener(new OyenteGiro());
        panelGiro.add(accionGiro, BorderLayout.SOUTH);
        add(panelGiro, BorderLayout.EAST);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void startProccess() {
        cc = new CuentaCorriente();
        tccd = new ThreadCuentaCorrienteDepositar(cc, this);
        tccg = new ThreadCuentaCorrienteGirar(cc, this);
        tccd.status = true;
        tccg.status = true;
        tccd.start();
        tccg.start();
    }

    public void setTextAbono(String text) {
        textoAbono.append(text + "\n");
    }

    public void setTextGiro(String text) {
        textoGiro.append(text + "\n");
    }

    class OyenteAbono implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e != null) {
                if (TEXT_DETENER.equals(e.getActionCommand())) {
                    accionAbono.setText(TEXT_PROCESAR);
                    tccd.status = false;
                } else {
                    accionAbono.setText(TEXT_DETENER);
                    tccd.status = true;
                }
            }
        }
    }

    class OyenteGiro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e != null) {
                if (TEXT_DETENER.equals(e.getActionCommand())) {
                    tccg.status = false;
                    accionGiro.setText(TEXT_PROCESAR);
                } else {
                    accionGiro.setText(TEXT_DETENER);
                    tccg.status = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        CuentaCorrienteView view = new CuentaCorrienteView();
    }
}
