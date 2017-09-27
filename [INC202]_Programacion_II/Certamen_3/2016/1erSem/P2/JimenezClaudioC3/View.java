//debo extraer el texto de JPanel(al presionar boton) en un string, enviarlo a Morse/ASCII y convertirlo en un String en morse que luego mostrare en interfaz mostrar
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class View extends JFrame{
    
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle , panelOut, panelBtn;
    
    
    public View() {
        super("GUI + Threads");
    }
    
    public void start() { //metodo start, lo posiciona pero no lo hace visible;
        out = new JTextArea(80, 30); //AREA DE TEXTO DONDE SALE EL STRING Y VOY A MOSTRAR LA PALABRA.
        processBtn = new JButton("Inicio"); //processBtn nombre nombre
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout (new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //TITULO QUE DICE CONCURRENCIA
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); //CUADRO DE TEXTO.
        panelOut.add(out);
        add(panelOut, BorderLayout.CENTER);
        
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //BOTON
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        
        setSize (380,400);
        
        setVisible(true);
        
        processBtn.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent e){
                interfazmostrar interfaz = new interfazmostrar();
                interfaz.setTitle("Morse y ACSII");
                interfaz.setVisible(true);
                dispose();
            } 
        } //NO SE POR QUE ME DAU N ERROR ACA, SI CIERRO EL PARENTESIS DE ACTONLISTENER DE ARRIBA NO ME FUNCIONA XD PERO COMPILA IGUAL CON EL WARNING XD
        
    }
    
    
}
