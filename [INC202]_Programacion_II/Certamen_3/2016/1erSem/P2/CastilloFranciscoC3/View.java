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

public class View extends JFrame implements ActionListener {

    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;
    private JScrollPane scroll;//Se declaran JScrollPane
    private ThreadToMorse h1;//Se declaran las hebras
    private ThreadToASCII h2;

    public View() {
        super("GUI + threads");
    }

    public void start() {
        out = new JTextArea(80, 30);
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        scroll = new JScrollPane(out);
        setLayout(new BorderLayout());
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        scroll.add(out);//Se agrega el JTextArea al scroll
        scroll.setViewportView(out);//Se muestra el scroll con el JTextArea
        panelOut.add(scroll);//Se agrega al panel
        add(panelOut, BorderLayout.CENTER);
        processBtn.addActionListener(this); 
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.add(processBtn);
        add(panelBtn, BorderLayout.SOUTH);
        setSize(380, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (;;) {
            String palabra = RandomWord.generate();//Se utiliza la clase para generar palabras las toma el String
            h1 = new ThreadToMorse(this, palabra);//Se instancian las hebras se entregan los parametros del View y la palabra generada y luego se inician las hebras
            h1.start();
            h2 = new ThreadToASCII(this, palabra);
            h2.start();

        }
    }
    //Se sincroniza el metodo para que solo una hebra pueda usarla y no las dos a la vez
    public synchronized void mostrarPalabra(String palabra) {

        out.append(palabra + System.getProperty("line.separator"));//Se va agregando la palabra traducida ingresada por parametro al JTextArea
        notifyAll();//Se notifica que ya termino

    }
}
