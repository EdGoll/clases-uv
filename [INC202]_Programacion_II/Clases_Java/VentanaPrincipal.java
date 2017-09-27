
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VentanaPrincipal extends JFrame {

    JLabel titulo;
    JTextArea areaDeTexto;
    JFileChooser gestorArchivo;
    JButton botonExaminar;
                
    public VentanaPrincipal() {
        super("Ventana principal");
    }

    public void initComponent() {
        setLayout(new BorderLayout(5,10));
        
        titulo = new JLabel("Titulo de la aplicacion");
        add(titulo, BorderLayout.NORTH);

        areaDeTexto = new JTextArea();
        add(areaDeTexto, BorderLayout.CENTER);

        gestorArchivo = new JFileChooser();
        
        botonExaminar = new JButton("Examinar...");
        botonExaminar.addActionListener(new BotonLeerActionListener());
        add(botonExaminar, BorderLayout.SOUTH);
        
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class BotonLeerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            gestorArchivo.showOpenDialog(VentanaPrincipal.this);
            SalidaIngreso si = new SalidaIngreso();
            List<String> lineas = si.leer(gestorArchivo.getSelectedFile());
            for (String linea : lineas) {
                areaDeTexto.append(linea + "\n");
            }
        }
    }
}
