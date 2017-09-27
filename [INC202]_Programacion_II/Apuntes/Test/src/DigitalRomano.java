
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class DigitalRomano extends JFrame {

    int num, un, dec, cen, mil;
    String mil1 = "", mil2 = "", mil3 = "", cen1 = "", cen2 = "", cen3 = "", cen4 = "";
    String dec1 = "", dec2 = "", dec3 = "", dec4 = "", un1 = "", un2 = "", un3 = "", un4 = "";
    JButton botontransformar;
    JTextField Campodecimal, CampoRomano;

    public DigitalRomano() {
        super("DECIMAL-ROMANOS");
        setLayout(new FlowLayout()); //ordena de izquierda a derecha, y de arriba a abajo
        add(new JLabel("Decimal"));
        Campodecimal = new JTextField(5); //limite de columnas ,tamaño
        add(Campodecimal);

        //crea el  valor
        botontransformar = new JButton("Transformar");
        add(botontransformar);
        botontransformar.addActionListener(new OyenteBoton()); // addActionListener metodo para que el boton escuche
        add(new JLabel("Romano"));
        CampoRomano = new JTextField(6);
        add(CampoRomano);



        //se  instancia el frame
        setSize(400, 100);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    class OyenteBoton implements ActionListener { //para que le  boton haga algo se implemente el escucha y todo

        @Override								// lo que kiero que haga el boton haga se escribe aqui , es una interfaz
        public void actionPerformed(ActionEvent p) {

            String valor = CampoRomano.getText();
            int num = Integer.parseInt(valor); //ERROR ERROR ERROR ERROR

            if (num < 3500 && num > 0) {
                mil = num / 1000;
                un = num % 10;
                num = num / 10;
                dec = num % 10;
                num = num / 10;
                cen = num % 10;
                switch (mil) {
                    case 0:
                        mil1 = "";
                        break;
                    case 1:
                        mil1 = "M";
                        break;
                    case 2:
                        mil1 = "M";
                        mil2 = "M";
                        break;
                    case 3:
                        mil1 = "M";
                        mil2 = "M";
                        mil3 = "M";
                        break;
                }
                switch (cen) {
                    case 0:
                        cen1 = "";
                        break;
                    case 1:
                        cen1 = "C";
                        break;
                    case 2:
                        cen1 = "C";
                        cen2 = "C";
                        break;
                    case 3:
                        cen1 = "C";
                        cen2 = "C";
                        cen3 = "C";
                        break;
                    case 4:
                        cen1 = "C";
                        cen2 = "D";
                        break;
                    case 5:
                        cen1 = "D";
                        break;
                    case 6:
                        cen1 = "D";
                        cen2 = "C";
                        break;
                    case 7:
                        cen1 = "D";
                        cen2 = "C";
                        cen3 = "C";
                        break;
                    case 8:
                        cen1 = "D";
                        cen2 = "C";
                        cen3 = "C";
                        cen4 = "C";
                        break;
                    case 9:
                        cen1 = "C";
                        cen2 = "M";
                        break;
                }
                switch (dec) {
                    case 0:
                        dec1 = "";
                        break;
                    case 1:
                        dec1 = "X";
                        break;
                    case 2:
                        dec1 = "X";
                        dec2 = "X";
                        break;
                    case 3:
                        dec1 = "X";
                        dec2 = "X";
                        dec3 = "X";
                        break;
                    case 4:
                        dec1 = "X";
                        dec2 = "L";
                        break;
                    case 5:
                        dec1 = "L";
                        break;
                    case 6:
                        dec1 = "L";
                        dec2 = "X";
                        break;
                    case 7:
                        dec1 = "L";
                        dec2 = "X";
                        dec3 = "X";
                        break;
                    case 8:
                        dec1 = "L";
                        dec2 = "X";
                        dec3 = "X";
                        dec4 = "X";
                        break;
                    case 9:
                        dec1 = "X";
                        dec2 = "C";
                        break;
                }
                switch (un) {
                    case 0:
                        un1 = "";
                        break;
                    case 1:
                        un1 = "I";
                        break;
                    case 2:
                        un1 = "I";
                        un2 = "I";
                        break;
                    case 3:
                        un1 = "I";
                        un2 = "I";
                        un3 = "I";
                        break;
                    case 4:
                        un1 = "I";
                        un2 = "V";
                        break;
                    case 5:
                        un1 = "V";
                        break;
                    case 6:
                        un1 = "V";
                        un2 = "I";
                        break;
                    case 7:
                        un1 = "V";
                        un2 = "I";
                        un3 = "I";
                        break;
                    case 8:
                        un1 = "V";
                        un2 = "I";
                        un3 = "I";
                        un4 = "I";
                        break;
                    case 9:
                        un1 = "I";
                        un2 = "X";
                        break;
                }
            }
            valor = mil1 + mil2 + mil3 + cen1 + cen2 + cen3 + cen4 + dec1 + dec2 + dec3 + dec4 + un1 + un2 + un3 + un4;
            CampoRomano.setText(valor);
        }
    }
    
    public static void main(String[] args) {
        DigitalRomano d = new DigitalRomano();
    }
}