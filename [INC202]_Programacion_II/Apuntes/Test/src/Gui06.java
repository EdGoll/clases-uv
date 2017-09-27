
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui06 extends JFrame {

    JButton rojo = new JButton("Rojo");
    JButton azul = new JButton("Azul");
    Container p;

    public Gui06() {
        super("Color de fondo");
        p = this.getContentPane();
        setLayout(new FlowLayout());
        add(rojo);
        add(azul);
        rojo.addActionListener(new OyenteRojo());
        azul.addActionListener(new OyenteAzul());
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        JOptionPane.showMessageDialog(
                this, // la ventana padre
                "Texto para el mensaje", // mensaje
                "Título", // título de la ventana de diálogo
                JOptionPane.ERROR_MESSAGE); 
                // JOptionPane.PLAIN_MESSAGE
                // JOptionPane.INFORMATION_MESSAGE
                // JOptionPane.WARNING_MESSAGE
        
        
        
        
    }

    public static void main(String args[]) {
        Gui06 ventana = new Gui06();
    }

    class OyenteRojo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            p.setBackground(Color.red);
        }
    }

    class OyenteAzul implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            p.setBackground(Color.green);
        }
    }

    class OyenteAceptar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            
        }
    }
    
    class OyenteItem implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
        }
    }
}