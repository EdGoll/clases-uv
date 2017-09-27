package test;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    
    JFileChooser jFileChooser;
    
    public VentanaPrincipal() {
        super("Ventana principal");
        setSize(400, 400);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void initiComponent() {
        //jFileChooser
    }
}
