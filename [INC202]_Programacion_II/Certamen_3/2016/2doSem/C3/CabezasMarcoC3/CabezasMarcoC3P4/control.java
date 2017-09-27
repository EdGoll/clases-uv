

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

public class control extends JFrame {

    JButton traducir;
    JTextArea texto1, traduccion1;
    JScrollPane jcp1, jcp2;
    JRadioButton r1, r2, r3, r4, r5, r6;

    public control() {
        //Interfaz
        super("Traductor");
        System.out.println("Iniciando Interfaz");
        setLayout(new FlowLayout());
        add(new JLabel("Texto"));
        texto1 = new JTextArea(10, 20);

        jcp1 = new JScrollPane(texto1);
        add(jcp1);

        add(new JLabel("Traduccion"));
        traduccion1 = new JTextArea(10, 20);
        jcp2 = new JScrollPane(traduccion1);
        add(jcp2);

        traducir = new JButton("Traducir");
        add(traducir);
        traducir.addActionListener(new Traducir());

        //Botones de uso
        r1 = new JRadioButton("Texto->Ascii", true);
        r2 = new JRadioButton("Ascii->Morse", false);
        r3 = new JRadioButton("Morse->Ascii", false);
        r4 = new JRadioButton("Morse->Texto", false);
        r5 = new JRadioButton("Ascii->Texto", false);
        r6 = new JRadioButton("Texto->Morse", false);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
        add(r6);
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(r1);
        grupo1.add(r2);
        grupo1.add(r3);
        grupo1.add(r4);
        grupo1.add(r5);
        grupo1.add(r6);

        setResizable(false);
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class Traducir implements ActionListener {

        @Override
        //Traduccion en base al radiobutton seleccionado
        public void actionPerformed(ActionEvent e) {

            if (r1.isSelected() == true) {// Texto a ascii
                t_aascii alf = new t_aascii();
                traduccion1.setText(alf.Aascii(texto1.getText()));
            }

            if (r2.isSelected() == true) {// Ascii a morse
                m_aascii alf = new m_aascii();
                traduccion1.setText(alf.M_aascii(texto1.getText()));
            }

            if (r3.isSelected() == true) {//morse a ascii
                m_aascii alf = new m_aascii();
                traduccion1.setText(alf.M_aascii(texto1.getText()));
            }

            if (r4.isSelected() == true) { //morse a texto
                t_amorse alf = new t_amorse();
                traduccion1.setText(alf.Amorse(texto1.getText()));
            }

            if (r5.isSelected() == true) { // ascii a texto: ascii a morse y morse a textoo
                String aux = null;
                m_aascii alf = new m_aascii();
                t_amorse alf2 = new t_amorse();
                aux = alf.M_aascii(texto1.getText());

                traduccion1.setText(alf2.Amorse(aux));
            }

            if (r6.isSelected() == true) {// Texto a morse: texto a ascii y ascii a morse
                String aux = null;
                t_aascii alf = new t_aascii();
                aux = alf.Aascii(texto1.getText());
                m_aascii alf2 = new m_aascii();

                traduccion1.setText(alf2.M_aascii(aux));
            }

        }

    }
}
