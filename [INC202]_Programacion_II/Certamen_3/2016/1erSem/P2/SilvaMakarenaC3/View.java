import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class View extends JFrame {
    public JTextArea out;
    private JButton processBtn;
    private JPanel panelTitle, panelOut, panelBtn;

    public void setOut(JTextArea out) {
        this.out = out;                     //Se setteará con la traducción obtenida!
    }
    
    public View(){
        super("GUI + Threads");
    }
    
    public void start() {
        out = new JTextArea(17, 30);        //Se ha modificado el tamaño del area de texto de 80 a 17 para encajar con el tamaño de la pantalla y luzcan ambos extremos del scroll.
        processBtn = new JButton("Inicio");
        panelTitle = new JPanel();
        panelOut = new JPanel();
        panelBtn = new JPanel();
        
        setLayout(new BorderLayout());
        
        panelTitle.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelTitle.add(new JLabel("Concurrencia"));
        add(panelTitle, BorderLayout.NORTH);
        
        panelOut.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        out.setEditable(false);                 //Se cancela edición por parte del usuario.
        JScrollPane sp = new JScrollPane(out);  
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelOut.add(sp);
        add(panelOut, BorderLayout.CENTER);        
    
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.add(processBtn);
        processBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ThreadToMorse a = new ThreadToMorse(out);   //Se pasa TextArea al constructor para posteriormente concatenar traducción. 
                a.start();
                ThreadToASCII b = new ThreadToASCII(out);
                b.start();
            }
        });
        add(panelBtn, BorderLayout.SOUTH);
        setSize(380, 400);
        setResizable(false);                //Evita que el usuario modifique el tamaño de la ventana.
        setLocationRelativeTo(null);        //Ubica la ventana en medio de la pantalla.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

}
